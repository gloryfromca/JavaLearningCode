package threadPractice;

public class ThreadShareClassStaticVariable extends Thread {
	// class static variables are shared across all threads in java.
	// a normal variable (instance variables), isn't shared across all threads in
	// java.
	private static int countDown = 5;
	private double d = 0;

	public ThreadShareClassStaticVariable(int priority) {
		setPriority(priority);
		System.out.println(getName() + ": my priority is " + priority);
		// code below will return 'main' as threadName.
		// System.out.println(Thread.currentThread().getName() + ": my priority is " +
		// priority);
	}

	public void run() {
		while (true) {
			for (int s = 1; s < 10000000; s++) {
				d = d + (Math.E + Math.PI) / (double) s;
			}
			System.out.println(getName() + ": one calculation end!");
			System.out.println(getName() + ": countDown:" + countDown);
			// code below will not work, because threads don't share anything except class
			// static variables.
			// synchronized (this) {
			if (--countDown <= 0) {
				System.out.println(getName() + ": all opportunities to calculate are used up!");
				return;
			}

		}

	}

	public static void main(String[] args) {
		ThreadShareClassStaticVariable s = new ThreadShareClassStaticVariable(Thread.MAX_PRIORITY);
		s.start();
		for (int i = 0; i < 4; i++) {
			ThreadShareClassStaticVariable si = new ThreadShareClassStaticVariable(Thread.MIN_PRIORITY);
			si.start();
		}
		ThreadShareClassStaticVariable si = new ThreadShareClassStaticVariable(9);
		si.start();

	}

}
