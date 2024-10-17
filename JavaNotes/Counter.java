package Self_note;

import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        boolean result = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a floating-point number:"); 
        float realValue = scan.nextFloat();
        
        if (realValue >= 20) {
            result = true;
        } else {
            result = false;
        }
        
        System.out.println(result);
        scan.close();
    } 
}
