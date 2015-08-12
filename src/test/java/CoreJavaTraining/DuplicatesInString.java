package CoreJavaTraining;

public class DuplicatesInString {
	
	public static String string = "Helllo World!!";
	
	public static String findDuplicates(String str) {
		String dups = "";
		char [] arr = str.toCharArray();
		for (int i = 0 ; i < arr.length-1 ; i++ ) {
			for (int k = i+1; k < arr.length; k++) {
				if(arr[i] == arr[k]) {
					if(dups.indexOf(str.charAt(i)) < 0) {
						dups += arr[i];
					}	
				}
			}
		}
			
		return dups;
	}
	
	
	public static void main(String[] args) {
		System.out.println(findDuplicates(string));
	}

}
