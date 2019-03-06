//This program was created by Kevin Coyle on 2/26/19.
public class Lesson3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\\b\\c\\\"d\"");
		System.out.println(" ");
		System.out.println("\\t is a tab, \\n is a new line, \\\" prints a \"quote\"");
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
		System.out.println(word3.substring(0, 5).toUpperCase()+ "\nis" + word3.substring(7, 12).toUpperCase());
		System.out.println(" ");
		String word4 = "Every Way The Wind Blows";
		System.out.println(word4.substring(0, 5).toLowerCase() + word4.substring(5, 9).toUpperCase() + word4.substring(9, 13).toLowerCase() + " \\" + word4.substring(14, 18).toUpperCase() + "\\" + word4.substring(18, 24).toLowerCase() + " 4");
		System.out.println(" ");
		String word5 = "Peter Piper Picked A Peck Of Pickled Peppers";
		System.out.println(word5.substring(19, 20) + word5.substring(20, 36).toLowerCase() + "\t" + word5.substring(37, 44).toLowerCase() + " " +  word5.substring(0, 11) + "\t" + word5.substring(12, 18).toLowerCase());
		System.out.println(" ");
		String word6 = "word has 4 letters";
		String partOfword6 = word6.substring(8, 9) + word6.substring(10, 18);
		System.out.println("\"" + word6.substring(9, 10) + "\"" + word6.substring(10, 18) + word6.substring(4, 9) + "\"" + partOfword6.length() + "\"" + word6.substring(10, 18));
		System.out.println(" ");
		String word7 = "if SUBSTRING is used";
		String partOfword7 = word7.substring(3, 12);
		System.out.println(word7.substring(3, 13).toLowerCase() + word7.substring(13, 16) + partOfword7.length());
		System.out.println(" ");
		String word8 = "Jim, Jacky, Johnny, Jill";
		System.out.println(word8.substring(0, 3).toLowerCase() + "\\3" + "\n" + word8.substring(5, 10).toUpperCase() + "\\5" + "\n" + word8.substring(12, 18).toLowerCase() + "\\6" + "\n" + word8.substring(20, 24).toUpperCase() + "\\4");
	}

}
