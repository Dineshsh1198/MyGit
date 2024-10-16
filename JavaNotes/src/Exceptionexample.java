import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionexample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int age = scan.nextInt();

            String name = scan.nextLine();
            int ages = scan.nextInt();
        System.out.println(ages);
        System.out.println(name);}
        catch (InputMismatchException e)
        {
            System.out.println("Eror is " + " " + e);
        }
    }
}
