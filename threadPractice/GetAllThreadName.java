package threadPractice;

public class GetAllThreadName extends Thread{

	public static void main(String[] args) {
		GetAllThreadName s1 = new GetAllThreadName();
		s1.setName("thread1");
		s1.start();
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int noThreads = currentGroup.activeCount();
		Thread[] lstThreads = new Thread[noThreads];
		currentGroup.enumerate(lstThreads);
		for (int i = 0; i < noThreads; i++) {
			String si = lstThreads[i].getName();
			System.out.println(si);
			
		}
		
	}

}
