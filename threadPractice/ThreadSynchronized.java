package threadPractice;

class MyThread extends Thread {
	boolean waiting = true;
	boolean ready = false;

	MyThread() {
	}

	public void run() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " starting.");
		while (waiting)
			System.out.println("waiting:" + waiting);
		System.out.println("waiting...");
		startWait();
		try {
			System.out.println("thrd:I will sleep!");
			Thread.sleep(100);
			System.out.println("thrd:wake up!");
		} catch (Exception exc) {
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}

	synchronized void startWait() {
		try {
			while (!ready)
				wait();
			System.out.println("end wait!");
		} catch (InterruptedException exc) {
			System.out.println("wait() interrupted");
		}
	}

	synchronized void notice() {
		ready = true;
		System.out.println("notice!");
		notify();
	}
}

public class ThreadSynchronized {
	public static void main(String args[]) throws Exception {
		MyThread thrd = new MyThread();
		thrd.setName("MyThread #1");
		showThreadStatus(thrd);
		thrd.start();
		showThreadStatus(thrd);
		Thread.sleep(1);
		System.out.println("main:change waiting!");
		showThreadStatus(thrd);
		thrd.waiting = false;
		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.notice();
		Thread.sleep(50);
		showThreadStatus(thrd);
		while (thrd.isAlive()) {
			Thread.sleep(50);
			System.out.println("main:thrd alive");
		}
		showThreadStatus(thrd);
	}

	static void showThreadStatus(Thread thrd) {
		// state
		// NEW: new thread is just created
		// RUNNABLE: thread waiting for CPU
		// WAITING: thread that is waiting for lock
		// TIMED_WAITING: thread that is running thread.sleep()
		// TERMINATED: dead thread
		System.out.println("main:" + thrd.getName() + "Alive:=" + thrd.isAlive() + " State:=" + thrd.getState());
	}
}