//This program was created by Kevin Coyle on 2/26/19.
public class NameThatCelebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Allan Alda";
		String s2 = "John Wayne";
		String s3 = "Gregory Peck";
		int l1 = s1.length() - 3;
		int l2 = s2.length() - 3;
		int l3 = s3.length() - 3;
		
		System.out.println(s1.substring(2, l1) + "\n" + s2.substring(2, l2) + "\n" + s3.substring(2, l3));
	}

}
