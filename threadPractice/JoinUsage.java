package threadPractice;

public class JoinUsage extends Thread {
	private int countDown = 5;
	private static int numThread = 0;

	public JoinUsage() {
		super("" + ++numThread);
		start();// JVM will call run()
	}

	public String toString() {
		return "#" + getName() + ": " + countDown;
	}

	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown <= 0) {
				return;
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new JoinUsage().join();
		}
	}

}
