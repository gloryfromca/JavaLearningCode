package threadPractice;

import java.io.IOException;

public class InterruptUsage extends Thread{
	@Override
	public void run() {
		try {
			sleep(1000*1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		InterruptUsage a1 = new InterruptUsage();
		a1.start();
		System.out.println("press any key to interrupt the thread!");
		System.in.read();
		a1.interrupt();
		a1.join();
		System.out.println("thread has been interrupted!");
	}

}
