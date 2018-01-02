package threadPractice;

public class ConsumerProducter {

	public static void main(String[] args) throws InterruptedException {
		PipeLine pl = new PipeLine(5);
		for (int i = 0; i < 4; i++) {
			new Consumer(pl).start();
		}
		for (int i = 0; i < 4; i++) {
			new Producter(pl).start();
		}

	}

}

class Consumer extends Thread {
	PipeLine pipeLine;

	public Consumer(PipeLine pipeLine) {
		this.pipeLine = pipeLine;

	}

	public void run() {
		try {
			String si = pipeLine.get();
			System.out.println("Consumer " + getName() + " gets:" + si);
			Thread.sleep(10);
		} catch (Exception e) {
			System.err.println("consumer error!");
		}
	}

}

class Producter extends Thread {
	PipeLine pipeLine;

	public Producter(PipeLine pipeLine) throws InterruptedException {
		this.pipeLine = pipeLine;
	}

	public void run() {
		try {
			String si = "si";
			pipeLine.put(si);
			System.out.println("Producter " + getName() + " puts:" + si);
			Thread.sleep(10);

		} catch (Exception e) {
			System.err.println("producter error!");
		}
	}

}

class PipeLine {

	String[] strings;
	int n;
	int get = -1;
	int put = -1;
	int remaining;// empty location

	public PipeLine(int n) {
		strings = new String[n];
		this.n = n;
		this.remaining = n;
	}

	public synchronized String get() throws InterruptedException {

		while (remaining == n) {
			wait();
		}
		get = (++get) % n;
		System.out.println("get() remaining is " + remaining);
		remaining++;
		notifyAll();
		return strings[get];

	}

	public synchronized void put(String si) throws InterruptedException {

		while (remaining == 0) {

			wait();
		}
		put = (++put) % n;
		System.out.println("put() remaining is " + remaining);
		remaining--;
		notifyAll();
		strings[put] = si;
	}

}