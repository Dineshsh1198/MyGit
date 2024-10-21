package Self_note;

public class FindingNoOfVowelsInGivenString {

	public static void main(String[] args) {
		String Name = "thedj chuw cucuAJSJSJSwkc b nsoc ndnviwncopppqoweennncciouu";
		Name = Name.toLowerCase();
		int vowelscount=0;
		int length = Name.length();
		System.out.println(length);
		for (int i=0; i<length;i++) {
			if (Name.charAt(i)=='a' || Name.charAt(i)=='e' || Name.charAt(i)=='i' || Name.charAt(i)=='o' || Name.charAt(i)=='u') {
				vowelscount ++;
			}
		
			
		}
		System.out.println(vowelscount);
	}

}
