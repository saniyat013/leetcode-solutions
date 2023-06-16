package problems.neetcode150.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
//	Solution with ArrayList
//	List<Integer> stack;
//	List<Integer> minStack;
//
//	public MinStack() {
//		stack = new ArrayList<>();
//		minStack = new ArrayList<>();
//	}
//
//	public void push(int val) {
//		stack.add(val);
//
//		int tempMin = Math.min(minStack.isEmpty() ? val : minStack.get(minStack.size() - 1), val);
//		minStack.add(tempMin);
//	}
//
//	public void pop() {
//		stack.remove(stack.size() - 1);
//		minStack.remove(minStack.size() - 1);
//	}
//
//	public int top() {
//		return stack.get(stack.size() - 1);
//	}
//
//	public int getMin() {
//		return minStack.get(minStack.size() - 1);
//	}

//	Solution with built it Stack
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);

		int tempVal = Math.min(minStack.isEmpty() ? val : minStack.peek(), val);
		minStack.push(tempVal);
	}

	public void pop() {
		stack.pop();
		minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.stack);
		System.out.println(minStack.minStack);
		System.out.println(minStack.getMin()); // return -3
		minStack.pop();
		System.out.println(minStack.top()); // return 0
		System.out.println(minStack.getMin()); // return -2
		System.out.println(minStack.stack);
	}

}
