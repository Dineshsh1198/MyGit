package Self_note;

public class Lengthofthestring {

	public static void main(String[] args) {
		String name = "Dinesh";
		
	char[]  charArray = name.toCharArray();
	int length =0;
	for (char c: charArray ) {
		length ++;
	}
	System.out.println(length);
	

	}

}
