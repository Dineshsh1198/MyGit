package Self_note;

public class FindingOccuranceOfACharInString {

	public static void main(String[] args) {
		// With iteration
		String givenname = "Agniprasthaaaaaath";
		char Tofind = 'a';
		givenname = givenname.toLowerCase();
		int occureamce = 0;
		
		for (int i=0;i<givenname.length();i++)
		{
			if (givenname.charAt(i)== Tofind) {
				occureamce = occureamce +1;
				
			} 
		}System.out.println("the occurance is " + occureamce);
			
		// Without iteration
		
		//1.convert the inputs into unique format
		//2.find the length of the actual input
		//3. replace the Tofind char with empty String
		//4.find the lenghth after replacing
		//5.occurance = actual length - lenght after replacing
		givenname = givenname.toUpperCase();
		 String charTofind = Character.toString(Tofind).toUpperCase();
		 int actuallength = givenname.length();
		 System.out.println("actuallength is " + actuallength);
		 
		 givenname = givenname.replace(charTofind, "");
		  System.out.println("length after replacing " + givenname.length());
		  
		  int occur = actuallength - givenname.length();
		  System.out.println("the occurance is " + occur);
		 
		
	}

}
