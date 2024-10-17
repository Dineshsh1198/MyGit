package Self_note;

public class Reversewords {

	public static void main(String[] args) {

String sentence = "the term of the history";
String reversed= "";
String temp[] = sentence.split(" ");
System.out.println(temp.length);
for(int i=temp.length-1;i>=0;i--) {
	reversed = reversed +" " + temp[i];

}
System.out.println(reversed);
}
}