package dataStructurePractice;

import java.util.Optional;

public class MyStack<T> {
	public int top;
	public  T[] stackArray;
	private long maxSize;

	public MyStack(int s) {
		// TODO Auto-generated constructor stub
		this.maxSize = s;
		@SuppressWarnings("unchecked")
		T[] ts = (T[]) new Object[s];
		this.stackArray = ts;
		this.top = -1;
	}

	public boolean isFull() {
		return maxSize - top == 1;
	}

	public boolean notFull() {
		return maxSize - top > 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean notEmpty() {
		return top > -1;
	}

	// OutOfIndex Error will be raised by Array of 'long' type.
	public void push(T item) throws ArrayIndexOutOfBoundsException {
		try {
			stackArray[++top] = item;
		} catch (ArrayIndexOutOfBoundsException e) {
			// code line below not a Atomic Operation.
			top--;
			System.err.println("Stack is Full!");
			e.printStackTrace();

		}
	}

	public Optional<T> pop() throws ArrayIndexOutOfBoundsException {
		try {
			return Optional.ofNullable(stackArray[top--]);
		} catch (ArrayIndexOutOfBoundsException e) {
			top++;
			System.err.println("Stack is Empty!");
			e.printStackTrace();
			return Optional.ofNullable(null);
		}
	}
	
	public Optional<T> peek() throws ArrayIndexOutOfBoundsException {
			try {
				return Optional.ofNullable(stackArray[top]);
			} catch (ArrayIndexOutOfBoundsException e) {
				return Optional.ofNullable(null);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<Integer> theStack = new MyStack<Integer>(3);
		theStack.push(10);
		theStack.push(11);
		theStack.push(12);
		theStack.push(13);
		theStack.push(14);
		//java.lang.ClassCastException
		//System.out.println("length:" + theStack.stackArray.length);
		System.out.println("top:" + theStack.top);
		System.out.println(theStack.peek());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop().get());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.notEmpty());
		System.out.println(theStack.peek());
	}

}
