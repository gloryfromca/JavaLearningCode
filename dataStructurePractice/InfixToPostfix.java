package dataStructurePractice;

import java.util.HashMap;

public class InfixToPostfix {
	// must instantiate String type by using "", or will appear `null` at first of
	// String.
	// private String out = "";

	private static HashMap<Character, Integer> markMap = new HashMap<Character, Integer>();
	static {
		markMap.put('+', 1);
		markMap.put('-', 1);
		markMap.put('*', 2);
		markMap.put('/', 2);
		markMap.put('^', 3);
	}

	public String doPostfix(String in) {
		String out = "";
		MyStack<Character> theStack = new MyStack<Character>(20);
		// signal for brackets
		int numBracket = 0;
		String inner = "";
		for (int i = 0; i < in.length(); i++) {
			Character ch = in.charAt(i);

			if (ch == '(') {
				if (numBracket++ > 0) {
					inner = inner + ch;
				}
			} else if (ch == ')') {
				if (--numBracket > 0) {
					inner = inner + ch;
				}
				// must decide on making a recursive call immediately when get the ')', or
				// will end for-loop then return "" if no Character after ')'
				if (numBracket == 0 && inner != "") {
					out = out + doPostfix(inner);
					inner = "";
				}
			} else if (numBracket != 0) {
				inner = inner + ch;
			} else if (markMap.containsKey(ch)) {
				int nowChLevel = markMap.get(ch);
				while (theStack.notEmpty() && nowChLevel <= markMap.get(theStack.peek().get())) {
					out = out + theStack.pop().get();
				}
				theStack.push(ch);
			} else {
				out = out + ch;
			}
		}
		while (theStack.notEmpty()) {
			out = out + theStack.pop().get();
		}

		return out;
	}

	public static void main(String[] args) {
		String s = new InfixToPostfix().doPostfix("1+2*4/5-7+3/6");
		System.out.println(s);
		String s1 = new InfixToPostfix().doPostfix("1+2*4/5-7+3/6+4^5");
		System.out.println(s1);
		String s2 = new InfixToPostfix().doPostfix("(1+2)*4/5-7+3/6+4^5");
		System.out.println(s2);
		String s3 = new InfixToPostfix().doPostfix("((1+2)*5)*4/5-7+3/6+4^5");
		System.out.println(s3);
		String s4 = new InfixToPostfix().doPostfix("((1+2)*5)*4/5-(7+3)/6+4^5");
		System.out.println(s4);
		String s5 = new InfixToPostfix().doPostfix("((1+2))*4/5-(7+3)/6+4^5");
		System.out.println(s5);
		String s6 = new InfixToPostfix().doPostfix("(1+2)");
		System.out.println(s6);
		String s7 = new InfixToPostfix().doPostfix("(((1+2))*4/5-(7+3)/6+4^5)");
		System.out.println(s7);
	}

}
