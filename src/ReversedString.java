
public class ReversedString {

	
	public static void main (String[] args) {
		
		String myName = "Rahul Kawatghare";
		String name = "Rahul Kawatghare";
		String reverseMyName = reverseString(myName);
		String anotherName = "Meena";
		System.out.print(reverseMyName);
		System.out.print("MASTER BRANCH");
	}
	
	public static String reverseString (String s) {
		
		int count = s.length();
		
		String reverse = "";
		for (int i= count-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		
		return reverse;
	}
}
