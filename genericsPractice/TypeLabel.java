package genericsPractice;

class Building {
}

class SxHouse extends Building {
}

class JsHouse extends Building {
}

class MyHouse<T> {
	Class<T> realClass;
	T t;

	public MyHouse(Class<T> type) {
		this.realClass = type;
		try {
			t = this.realClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public boolean isInstance(Object obj) {
		return this.realClass.isInstance(obj);
	}
}

public class TypeLabel {

	public static void main(String[] args) {
		MyHouse<SxHouse> sx = new MyHouse<SxHouse>(SxHouse.class);
		MyHouse<JsHouse> js = new MyHouse<JsHouse>(JsHouse.class);
		System.out.println(sx.isInstance(js));
		System.out.println(sx.isInstance(new Building()));
		System.out.println(sx.isInstance(new JsHouse()));
		System.out.println(sx.isInstance(new SxHouse()));
	}

}
