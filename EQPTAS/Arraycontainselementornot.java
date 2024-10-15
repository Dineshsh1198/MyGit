package Self_note;

public class Arraycontainselementornot {
	
	int[] number = {12,242,2434,23,43,5342,4};
	int givennumber = 242;
	boolean found =false;
void Check() {
	for (int num:number) {
		if (num == givennumber) {
			found = true;
			System.out.println(found);
		} 
		
	}}
	
	public static void main(String args[]) {
		Arraycontainselementornot  arr = new Arraycontainselementornot ();
		arr.Check();
	}

}
