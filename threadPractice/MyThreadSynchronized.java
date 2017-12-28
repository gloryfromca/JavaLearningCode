package threadPractice;

public class MyThreadSynchronized extends Thread {

	public boolean prepared = false;

	public synchronized void doWhenPrepared() {
		try {
			while (!prepared) {
				System.out.println("something is not prepared yet!");
				wait();
			}
			Thread.sleep(10);
			System.out.println("something is consumed already!");

		} catch (InterruptedException e) {
			System.err.println("Interrupted by keyboard!");
		}

	}

	public void run() {
		doWhenPrepared();
		System.out.println("the thread end!");
	}

	public synchronized void prepared() {
		prepared = true;
		System.out.println("something is prepared!");
		notify();
	}

	public static void main(String[] args) throws InterruptedException {
		MyThreadSynchronized myThread = new MyThreadSynchronized();
		myThread.start();
		Thread.sleep(10);
		System.out.println("main:the thread is " + myThread.getState());
		myThread.prepared();
		Thread.sleep(10);
		System.out.println("main:the thread is " + myThread.getState());
		Thread.sleep(20);
		System.out.println("main:the thread is " + myThread.getState());

	}

}
