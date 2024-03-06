package sec2;

public class CharStack {
	private StringBuffer stack;
	
	public CharStack() {
		stack = new StringBuffer();
	};
	
	public CharStack(int capacity) {
		stack = new StringBuffer(capacity);
	}
	public void push(char c) {
		stack = stack.append(c);
	}
	public int pop() {
		char ch = stack.charAt(stack.length()-1);
		stack = stack.deleteCharAt(stack.length()-1);
		return ch;
	}
	
	public char[] list() {
		char[] arr = stack.substring(0).toCharArray();
		
		return arr;
	}

	@Override
	public String toString() {
		return "CharStack [stack=" + stack + "]";
	}
	
	
}
