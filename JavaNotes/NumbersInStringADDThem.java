package Self_note;

public class NumbersInStringADDThem {

	public static void main(String[] args) {
		String name = "Tebuucb3875438bdbj";
		
		int total =0;
		int length = name.length();
		
		for (int i=0;i<length;i++){
			char currChar = name.charAt(i);
			if(Character.isDigit(currChar)) {
				total = total+ Character.getNumericValue(currChar);
			}
		}System.out.println(total);
	}

}
