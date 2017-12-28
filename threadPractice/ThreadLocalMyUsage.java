package threadPractice;

public class ThreadLocalMyUsage implements Runnable {
	private AnotherThreadID<Long> var;

	public ThreadLocalMyUsage(AnotherThreadID<Long> v) {
		this.var = v;
	}

	public void run() {
		try {
			print("var getThreadID =" + var.get());
			Thread.sleep(200);
			var.set(Thread.currentThread().getId());
			print("var getThreadID =" + var.get());
		} catch (InterruptedException x) {
		}
	}

	private static void print(String msg) {
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + msg);
	}

	public static void main(String[] args) {
		AnotherThreadID<Long> tid = new AnotherThreadID<Long>() {
			@Override
			public Long initialValue() {
				System.out.println("I'm in initialValue()!");
				return new Long(100);
			}
		};
		ThreadLocalMyUsage shared = new ThreadLocalMyUsage(tid);

		try {
			Thread threadA = new Thread(shared, "threadA");
			threadA.start();

			Thread.sleep(50);

			Thread threadB = new Thread(shared, "threadB");
			threadB.start();

			Thread.sleep(50);

			Thread threadC = new Thread(shared, "threadC");
			threadC.start();
		} catch (InterruptedException x) {
		}
	}
}

class AnotherThreadID<T> extends ThreadLocal<T> {
	// you should not override default get() or set(), it really needs more
	// complicated work!
}
