package staticPractice;

class A {
	static {
		System.out.println("static OnceOnly");
	}
	// execute only one time when load class.

	{
		System.out.println("appearance initialization");
	}

	public static void printOnly() {
		System.out.println("static method");
	}

	public A() {
		System.out.println("A constructor");
	}
}

public class StaticOnceOnly {

	public static void main(String[] args) {
		A.printOnly();
		A.printOnly();
		A.printOnly();
		A a1 = new A();
		A a2 = new A();

	}

}
