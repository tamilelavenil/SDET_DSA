package redoPrograms;

import java.util.Stack;

public class validParentheses {

	public static void main(String[] args) {

		String brace = "()){}}[]";
		
		Stack<Character> stack = new Stack();
		int count =0;
		
		for(char each: brace.toCharArray()) {
			
			switch (each) {
			case ')':
				if(!stack.isEmpty()&&stack.pop()=='(') count++;
				break;
			case '}':	
				if(!stack.isEmpty()&&stack.pop()=='{') count++;
				break;
			case ']':
				if(!stack.isEmpty()&&stack.pop()=='[') count++;
				break;
			default:
				stack.push(each);
				break;
			}
			
		}

	}

}
