package threadPractice;

public class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {

		newThread t1 = new newThread("R");
		newThread t2 = new newThread("S");

		// this will call run() method
		t1.start();
		// if you don't use thread.sleep(), maybe t2 will use n to execute
		// initialValue() when t1 is executing "n--" but n is still 10, by the way,
		// that is to say, sentence "n--" may be not a Atomic;
		// Or you can use `synchronized` to make sentence "n--" to be Atomic.
		// you can comment out line below if `synchronized` in initialValue() of
		// ThreadLocal.
		Thread.sleep(100);
		t2.start();
	}
}

class newThread extends Thread {
	private static ThreadLocal t = new ThreadLocal() {
		protected synchronized Object initialValue() {
			return new Integer(n--);
		}
	};

	private static int n = 10;

	newThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 2; i++)
			System.out.println(getName() + " " + t.get());
	}
}
