package dataStructurePractice;


public class MyStack {
	public int top;
	public long[] stackArray;
	private long maxSize;
	public MyStack(int s) {
		// TODO Auto-generated constructor stub
		this.maxSize = s;
		this.stackArray = new long [s];
		this.top = -1;
	}
	public boolean isFull() {
		return maxSize-top==1;
	}
	public boolean notFull() {
		return maxSize-top>1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean notEmpty() {
		return top>-1;
	}
	
	//OutOfIndex Error will be raised by Array of 'long' type.
	public void push(long item) throws ArrayIndexOutOfBoundsException {
		try{
			stackArray[++top]=item;
			}
		catch (ArrayIndexOutOfBoundsException e) {
			// code line below not a Atomic Operation.
			top--;
			System.err.println("Stack is Full!");
			e.printStackTrace();

		}
	}
	
	public Object pop() throws ArrayIndexOutOfBoundsException{
		try{return stackArray[top--];}
		catch (ArrayIndexOutOfBoundsException e) {
			top++;
			System.err.println("Stack is Empty!");
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack theStack = new MyStack(3);
		theStack.push(10);
		theStack.push(11);
		theStack.push(12);
		theStack.push(13);
		theStack.push(14);
		System.out.println("length:"+theStack.stackArray.length);
		System.out.println("top:"+theStack.top);
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
	}

}
