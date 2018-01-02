package threadPractice;

public class LockTest {
	public static String a1 = "a1";
	public static String a2 = "a2";

	public static void main(String[] args) {
		new Thread(new LockA()).start();
		new Thread(new LockB()).start();
	}

}

class LockA implements Runnable {

	@Override
	public void run() {
		try {
			synchronized (LockTest.a1) {
				System.out.println("LockA has locked a1!");
				Thread.sleep(1000);
				try {
					synchronized (LockTest.a2) {
						System.out.println("a2 is locked by LockA!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class LockB implements Runnable {

	@Override
	public void run() {
		try {
			synchronized (LockTest.a2) {
				System.out.println("LockB has locked a2!");
				Thread.sleep(1000);
				try {
					synchronized (LockTest.a1) {
						System.out.println("a1 is locked by LockB!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
