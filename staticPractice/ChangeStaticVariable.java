package staticPractice;

class C{
	static int ChangedAmongAll = 1;
	int ChangedAmongInstance = 1;

	public C() {
		System.out.println("C constructor");
	}
}


public class ChangeStaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 =  new C();
		C c2 =  new C();
		c1.ChangedAmongAll = 10;
		System.out.println(c2.ChangedAmongAll);
		c1.ChangedAmongInstance = 10;
		System.out.println(c2.ChangedAmongInstance);
		
	}

}
