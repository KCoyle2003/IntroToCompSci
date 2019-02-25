//This program was created by Kevin Coyle on 2/19/19.
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "Kevin Coyle";
		int nameLength = myName.length();
		System.out.println(nameLength - 1);
		System.out.println(myName.substring(6));
		System.out.println(myName.toUpperCase());
		String lName = myName.substring(6);
		String fName = myName.substring(0, 5);
		System.out.println(fName + " " + lName);
	}

}
