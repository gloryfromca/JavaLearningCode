package functionPractice;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass my1 = new MyClass();
		my1.info();
		MyClass my2 = new MyClass(178);
		my2.info("height");

	}

}
class MyClass {
	// public type should define in its own file.
	int height =4;
	protected MyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("default:"+this.height);
		
	}
	protected MyClass(int s) {
		this.height = s;
		System.out.println("new height:"+this.height);
	}
	protected void info() {
		System.out.println("Nothing to say!");
	}
	protected void info(String s) {
		if (s=="height") {
			System.out.println("My Height is "+this.height);			
		}
		else {
			System.out.println("What do you say?");	
		}
	}
}
