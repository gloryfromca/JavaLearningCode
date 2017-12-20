package genericsPractice;

import java.util.ArrayList;
import java.util.List;

class Fruit {
}

class Apple extends Fruit {
}
class GoodApple extends Apple {
}

class Orange extends Fruit {

}

public class Wildcards {

	public static void main(String[] args) {

		// fruitBag is producer, we just get fruit from it which never be added by
		// any type of fruit(We can just add null to it).
		//Usually as return representing more strict return value.
		List<? extends Fruit> fruitBag = new ArrayList<Apple>();
		// fruitBag.add(new Fruit());
		// fruitBag.add(new Apple());
		// fruitBag.add(new Orange());
		
		fruitBag.add(null);
		List<? super Apple> fruitBag1 = new ArrayList<Fruit>();
		fruitBag1.add(new GoodApple());
		fruitBag1.add(new Apple());
		//fruitBag1.add(new Orange());
		//code below will raise Error can't pass through compilation
		//fruitBag1.add(new Object());
		

	}

}
