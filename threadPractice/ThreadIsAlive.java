package threadPractice;

public class ThreadIsAlive extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			printMsg();
		}
	}

	public static void printMsg() {
		// don't need use keyword `new`, just get currentThread
		Thread cThread = Thread.currentThread();
		String tname = cThread.getName();
		System.out.println("my name is " + tname);
	}

	public static void main(String[] args) {
		ThreadIsAlive tt = new ThreadIsAlive();
		System.out.println("before start, thread is " + tt.isAlive());
		tt.setName("SubThread");
		tt.start();
		System.out.println("after start, thread is " + tt.isAlive());
		for (int i = 0; i < 2; i++) {
			ThreadIsAlive.printMsg();
		}
		System.out.println("at end of thread, thread is " + tt.isAlive());
		for (int i = 0; i < 8; i++) {
			ThreadIsAlive.printMsg();
		}
		System.out.println("at end of thread, thread is " + tt.isAlive());

	}

}
