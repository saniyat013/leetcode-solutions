package problems.neetcode150.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public static int evalRPN(String[] tokens) {
		Stack<Integer> numStack = new Stack<>();

		for (String s : tokens) {
			if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				int num2 = numStack.pop();
				int num1 = numStack.pop();
				int result = 0;

				switch (s) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				}

				numStack.push(result);

			} else {
				numStack.push(Integer.parseInt(s));
			}
		}
		return numStack.peek().intValue();
	}

	public static void main(String[] args) {
		String[] tokens = { "10","6","9","3","+","-11","*","/","*","17","+","5","+" };
		System.out.println(evalRPN(tokens));
	}

}
