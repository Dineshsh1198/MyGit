import java.util.Scanner;

public class Statemachine {

    static  abstract class State {
        static State wakeup, bath, travel, current;

        abstract void enter();

        abstract void update();
    }


    class WakeupState extends State {
        void enter() {
            System.out.println("Wake up!");
        }

        void update() {
            System.out.println("1. Bath");
            System.out.println("2. Travel");
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            switch (input) {
                case "1":
                    current = bath;
                    break;
                case "2":
                    current = travel;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    class BathState extends State {
        void enter() {
            System.out.println("Bathing...");
        }

        void update() {
            System.out.println("Now heading to travel.");
            current = travel;  // Auto transition to travel after bath
        }
    }

    class TravelState extends State {
        void enter() {
            System.out.println("Traveling...");
        }

        void update() {
            System.out.println("End of travel.");
            // You could transition to another state here, e.g., work or sleep.
        }
    }

    public Statemachine() {
        State.wakeup = new WakeupState();
        State.bath = new BathState();
        State.travel = new TravelState();
        State.current = State.wakeup;  // Starting state
    }

    public static void main(String[] args) {
        Statemachine statemachine = new Statemachine();
        while (true) {
            State.current.enter();
            State.current.update();
        }
    }
}
