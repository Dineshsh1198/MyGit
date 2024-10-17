package Self_note;
import java.util.Scanner;


class Try {
	void set(int age) {
		if (age>18) {
			System.out.println("Eligible");
		} else {
			System.out.println("not Eligible");
		}
	}
}

public class License {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int A =scan.nextInt();
		Try obj = new Try();
		obj.set(A);

	}

}
