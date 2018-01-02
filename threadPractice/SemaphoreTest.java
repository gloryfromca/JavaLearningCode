package threadPractice;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {
	public static String obj1 = "a1";
	public static String obj2 = "a2";
	public static final Semaphore a1 = new Semaphore(1);
	public static final Semaphore a2 = new Semaphore(1);

	public static void main(String[] args) {
		new Thread(new SemaphoreA()).start();
		new Thread(new SemaphoreB()).start();

	}
}

class SemaphoreA implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				if (SemaphoreTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
					System.out.println("SemaphoreA has got a1!");
					if (SemaphoreTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
						System.out.println("SemaphoreA has got a2!");
						Thread.sleep(100 * 100);
						System.out.println("SemaphoreA has done something!");
						SemaphoreTest.a1.release();
						SemaphoreTest.a2.release();
					} else {
						System.out.println("SemaphoreA hasn't got a2!");
						SemaphoreTest.a1.release();
					}
				} else {
					System.out.println("SemaphoreA hasn't got a1!");
				}

				// System.out.println("SemaphoreA:" + SemaphoreTest.a1);
				// System.out.println("SemaphoreA:" + SemaphoreTest.a2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class SemaphoreB implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				if (SemaphoreTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
					System.out.println("SemaphoreB has got a2!");
					if (SemaphoreTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
						System.out.println("SemaphoreB has got a1!");
						Thread.sleep(100 * 100);
						System.out.println("SemaphoreB has done something!");
						SemaphoreTest.a1.release();
						SemaphoreTest.a2.release();
					} else {
						System.out.println("SemaphoreB hasn't got a1!");
						SemaphoreTest.a2.release();
					}
				} else {
					System.out.println("SemaphoreB hasn't got a2!");
				}
				// System.out.println("SemaphoreB:" + SemaphoreTest.a1);
				// System.out.println("SemaphoreB:" + SemaphoreTest.a2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
