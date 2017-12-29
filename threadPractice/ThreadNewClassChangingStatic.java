package threadPractice;

public class ThreadNewClassChangingStatic extends Thread {

	public void run() {
		CountDown ci = new CountDown();
		CountDown.countDown--;
		System.out.println(getName() + "'s countDown is " + CountDown.countDown);

	}

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			ThreadNewClassChangingStatic ti = new ThreadNewClassChangingStatic();
			ti.start();
			
		}
	}

}

class CountDown {
	public static int countDown = 10;
}
