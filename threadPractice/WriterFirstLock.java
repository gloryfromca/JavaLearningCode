package threadPractice;

public class WriterFirstLock {
	public int readers = 0;
	public int writers = 0;// 0 or 1
	public int writeRequests = 0;

	public static void main(String[] args) {
		WriterFirstLock wfl = new WriterFirstLock();
		Object shared = new Object();
		new WriteRead("threadA", shared, wfl).start();
		new WriteRead("threadA", shared, wfl).start();
		new WriteRead("threadB", shared, wfl).start();
	}

	public synchronized void wannaWrite() throws InterruptedException {
		writeRequests++;
		while (writers > 0 || readers > 0) {
			System.out.println(Thread.currentThread().getName() + " write wait...");
			wait();
		}
		writers++;
		writeRequests--;
		System.out.println(Thread.currentThread().getName() + " you can write!");
		notifyAll();
	}

	public synchronized void closeWrite() throws InterruptedException {
		if (writers == 1) {
			writers--;
		}
		System.out.println(Thread.currentThread().getName() + " close write!");
		notifyAll();
	}

	public synchronized void wannaRead() throws InterruptedException {
		while (writers > 0 || writeRequests > 0) {
			System.out.println(Thread.currentThread().getName() + " read wait...");
			wait();
		}
		readers++;
		System.out.println(Thread.currentThread().getName() + " you can read!");
		notifyAll();

	}

	public synchronized void closeRead() throws InterruptedException {
		if (readers > 0) {
			readers--;
		}
		System.out.println(Thread.currentThread().getName() + " close read!");
		notifyAll();
	}
}

class WriteRead extends Thread {
	Object shared;
	WriterFirstLock wfl;

	public WriteRead(String name, Object shared, WriterFirstLock wfl) {
		super(name);
		this.shared = shared;
		this.wfl = wfl;
	}

	@Override
	public void run() {
		try {
			if (getName() == "threadA") {

				wfl.wannaRead();
				Thread.sleep(1);
				wfl.closeRead();
				wfl.wannaRead();
				Thread.sleep(1);
				wfl.closeRead();
				wfl.wannaRead();
				Thread.sleep(1);
				wfl.closeRead();

			} else if (getName() == "threadB") {
				wfl.wannaWrite();
				System.out.println(Thread.currentThread().getName() + " begin write!");
				Thread.sleep(10);
				wfl.closeWrite();
				System.out.println(Thread.currentThread().getName() + " end write!");

			} else {

			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
