package threadPractice;

public class ThreadShareOneObject implements Runnable {

	public static void main(String[] args) {
		ThreadShareOneObject runnable = new ThreadShareOneObject();
		for (int i = 0; i < 4; i++) {
			Thread si = new Thread(runnable);
			si.start();
		}
	}

	// volatile can't stop threads from interleaving (not atomic).
	private int countDown = 8;

	@Override
	public void run() {
		int s = 1;
		while (true) {

			// code below will lock object `runnable` so that get a correct result.
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + " countDown before sleep is " + countDown);
				countDown--;
				// you really do "countDown--", then sleep(), you will find `countDown` is less
				// than you held.
				try {
					Thread.sleep((long) Math.random());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " countDown after sleep is " + countDown);
				if (countDown <= 0) {
					System.out.println(Thread.currentThread().getName() + " is Over");
					break;
				}
			}
			for (int i = 0; i < 1000000; i++) {
				s += i * (Math.PI + Math.E);
			}
			System.out.println(Thread.currentThread().getName() + " one calculation is Over");
		}

	}

}
