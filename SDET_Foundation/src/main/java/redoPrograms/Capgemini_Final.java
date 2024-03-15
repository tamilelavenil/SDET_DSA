package redoPrograms;

public class Capgemini_Final {

	public static void main(String[] args) {
		String input ="t34aM6i2L78";
		
	
		System.out.println(convert(input));
		
	}
	
	public static StringBuilder convert(String input) {
		StringBuilder output = new StringBuilder();
		for(char eachChar: input.toCharArray()) {
			
			if(Character.isDigit(eachChar)) {
				output.append(eachChar);
			}
		}
		
		//System.out.println(output);
		return output;
		
	}

}
