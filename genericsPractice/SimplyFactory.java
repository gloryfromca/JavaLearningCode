package genericsPractice;

import org.omg.CORBA.PUBLIC_MEMBER;

interface Factory<T>{
	T creat();
}

class IntegerGen implements Factory<Integer>{
	@Override
	public Integer creat() {
		return new Integer(10);
	}
}
  
class Widget{
	public static class FactoryInner implements Factory<Widget>{
		@Override
		public Widget creat() {
			return new Widget();
		}
	}
	public void whoAmI() {
		System.out.println("I'm a instance of Widget");
	}
}

class Foo<T>{
	public T x;
	public <F extends Factory<T>> Foo(F factory){
		x = factory.creat();
	}
	public T get() {
		return x;
	}
}

public class SimplyFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Foo<Integer>(new IntegerGen()).get();
		Widget w = new Foo<Widget>(new Widget.FactoryInner()).get();
		System.out.println(i);
		System.out.println(w);
		w.whoAmI();
	}

}
