package foundation;

public class Zopsmart {

	public static void main(String[] args) {
		// String text = "A guy is sitting in a chair"; -> riahc a ni gnittis is yug A
		
		String input = "A guy is sitting in a chair";
		
		for(int i=input.length()-1; i>=0; i--) {
			
			System.out.print(input.charAt(i));
		}
		int[] arr = {2,4,8,10};
		
		System.out.println(checkOdd(arr));
		
	}
	
	public static boolean checkOdd(int[] arr) {
		
		for(int each: arr) {
			
			if(each%2!=0) {
				return true;
			}
		}
		
		return false;
		
	}

}
