package CoreJavaTraining;

public class RevertStringRecursive {
	
	public static String string = "Hello World!";
	public static String reversedString = "";
	
	
	public static String reverse(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		else {
		reversedString = str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
		}
		return reversedString;
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse(string));

	}

}
