package Self_note;

public class RemoveLeadingTrailingSpacesOfString {

	public static void main(String[] args) {
		String name = " TEgeg EEh ";
		//using strip
		System.out.println(name.trim());
		//using Strip(Java11)
		System.out.println(name.strip());
		System.out.println(name.stripLeading());
		System.out.println(name.stripTrailing());
		// using regex
		System.out.println(name.replaceAll("^[ \t]", name));
		System.out.println(name.replaceAll("[ \t]+$", name));
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", name));
	}

}
