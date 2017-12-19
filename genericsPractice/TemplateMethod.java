package genericsPractice;

class Obj {
}

abstract class GenericsWithCreator<T> {
	final T element;

	public GenericsWithCreator() {
		element = creat();
	}

	abstract T creat();
}

class Creator extends GenericsWithCreator<Obj> {
	@Override
	public Obj creat() {
		return new Obj();
	}

	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}

public class TemplateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Creator().f();

	}

}
