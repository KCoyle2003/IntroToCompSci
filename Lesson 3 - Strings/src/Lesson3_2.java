//This program was created by Kevin Coyle on 2/26/19.
public class Lesson3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\\b\\c\\\"d\"");
		System.out.println(" ");
		System.out.println("\\t is a tab, \\n is a new line, \\" + "prints a \"quote\"");
		System.out.println(" ");
		System.out.println("\"line one\" \n\\line\ttwo\\");
		System.out.println(" ");
		System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline*\\");
		System.out.println(" ");
		System.out.println("\"\\\\\"\\\"\"\n\t\\\"\\\"\"\\\n\\\"\"\"\"\\");
		System.out.println(" ");
		String word = "Birthday";
		System.out.println(word.toUpperCase());
		System.out.println(" ");
		String word2 = "it's my party";
		System.out.println(word2.substring(0, 4) + " a " + "\"" + word2.substring(8).toUpperCase() + "\"");
		System.out.println(" ");
		String word3 = "Whose a whats it";
		System.out.println(word3.substring(0, 5));
	}

}
