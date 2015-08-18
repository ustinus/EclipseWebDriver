package CoreJavaTraining;

public class FindMaxValueInArray {

	public static void findMaxInt(int[] arr) {
		
		if(arr.length < 1) {
			return;
		}
		
		int result = arr[0];
		if (arr.length == 1) {
			result = arr[0];
		}
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > result) {
				result = arr[i];
			}
		}
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		
		int[] array1 = {1,1,2,6,24,120,720,5040};
		int[] array2 = {-2,3,8,111};
		
		FindMaxValueInArray fmv = new FindMaxValueInArray();
		
		fmv.findMaxInt(array1);
		fmv.findMaxInt(array2);
		
	}

}
