package threadPractice;

public class InterruptThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("after main() call interrupt() func:");
			System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
			System.out.println("thread is interrupted!");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		InterruptThread si = new InterruptThread();
		si.setName("threadA");
		si.start();
		Thread.sleep(1000);
		si.interrupt();
		System.out.println("threadA is " + si.isInterrupted());
		Thread.sleep(2000);
		System.out.println("threadA is " + si.isInterrupted());
		System.out.println("threadA is " + si.isAlive());

	}

}
