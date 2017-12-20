package dataStructurePractice;

public class ReverseString {

	private String out;
	private String in;

	public ReverseString(String in) {
		this.in = in;
	}

	public String doRev() {
		int len = in.length();
		MyStack<Character> stack = new MyStack<Character>(len);
		for (int i = 0; i < len; i++) {
			stack.push(in.charAt(i));
		}
		out = "";
		while (!stack.isEmpty()) {
			out = out + stack.pop().get();
		}

		return out;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zhanghui";
		ReverseString res = new ReverseString(s);
		String output = res.doRev();
		System.out.println(output);

	}

}
