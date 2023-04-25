package question1.balancingbrackets;

import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bracketExpression = "([[{}]])";
		if (isBracketsBalanced(bracketExpression)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered String do not contain Balanced Brackets");
		}
	}

	public static boolean isBracketsBalanced(String bracketExpression) {

		Stack<Character> stack = new Stack<>();
		char[] c = bracketExpression.toCharArray();

		for (char ch : c) {
			if (ch == '(' || ch == '[' || ch == '{')
				stack.push(ch);
			else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty())
					return false;

				switch (ch) {
				case ')':
					if (stack.pop() != '(')
						return false;
					break;

				case ']':
					if (stack.pop() != '[')
						return false;
					break;

				case '}':
					if (stack.pop() != '{')
						return false;
					break;

				default:
					System.out.println("Invalid character in the bracket expression.");
					return false;
				}
			}
		}

		return stack.isEmpty();

	}
}
