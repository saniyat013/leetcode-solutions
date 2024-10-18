package com.saniyat.problemSolving.leetcodeSolutions.neetcode150.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> myStack = new Stack<>();
		Map<Character, Character> bracketMap = new HashMap<>();
		bracketMap.put(')', '(');
		bracketMap.put('}', '{');
		bracketMap.put(']', '[');

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (bracketMap.containsKey(c)) {
				if (!myStack.empty() && bracketMap.get(c).equals(myStack.peek())) {
					myStack.pop();
				} else {
					return false;
				}
			} else {
				myStack.push(c);
			}
		}

		return myStack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}

}
