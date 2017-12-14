package functionPractice;

enum People {
	zhanghui(22, 178), zhangbo(21, 180), nobody(20, 160);
	// enum is a process that instantiate series of item above.just like executing
	// __new__ before __init__ in Python.
	private int age;
	private int height;

	private People(int age, int height) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.height = height;
	}

	protected void printAge() {
		System.out.println(this + "'s age is " + this.age);
	}

	protected void printHeight() {
		System.out.println(this + "'s Height is " + this.height);
	}
}

public class AdvancedEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People zhangbo = People.zhangbo;
		zhangbo.printAge();
		zhangbo.printHeight();

	}

}
