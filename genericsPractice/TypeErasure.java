package genericsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class A {
}

class B {
}

class C<E> {
}

class D<S, T> {
}

public class TypeErasure {

	public static void main(String[] args) {
		
		//cannot convert from ArrayList<Apple> to List<Fruit>
		//List<Fruit> fruitBag = new ArrayList<Apple>();
				
		// type erasure come into action.
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);

		// TypeParameters is/are just Placeholder.
		List<A> list = new ArrayList<A>();
		Map<A, B> map = new HashMap<A, B>();
		C<B> c = new C<B>();
		D<Long, Double> d = new D<Long, Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(c.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(d.getClass().getTypeParameters()));

	}

}
