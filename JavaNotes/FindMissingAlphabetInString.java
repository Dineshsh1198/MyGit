package Self_note;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInString {

	public static void main(String[] args) {
	
		String Givenname = "A";
		Givenname = Givenname.toLowerCase();
		Givenname = Givenname.replaceAll(" ","");
		String [] newname = Givenname.split("");
		String [] username = "cdef".split("");
		
		HashSet <String> set1 = new HashSet <String>();
		for (String S: newname) {
			set1.add(S);
			
		}
		HashSet <String> set2 = new HashSet <String>(Arrays.asList(username));
		set2.removeAll(set1);
		
		System.out.println(set2);
		

	}

}
