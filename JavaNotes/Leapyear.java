package Self_note;

import java.util.Scanner;

class One{
	void set(int number) {
		if( (number%4==0) && number%100 !=0 || (number %400==0)){
			
			System.out.println(number+ " "+ "It is an leap year");
		}
		else {
			System.out.println(number+ " "+ "It is not an leap year");
		}
		
	}
}

public class Leapyear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		int year =scan.nextInt();
		One obj = new One();
		obj.set(year);

	}

}
