package functionPractice;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square(1.2, 1.3);
		Rectangle s2 = new Rectangle(1.2, 1.3);
		System.out.println(s1.areaOfFigure());
		System.out.println(s2.areaOfFigure());
		System.out.println(s1.areaOfFigure(1.2, 8.0));
		//static func should be accessed in a static way.
		System.out.println(Square.areaOfFigure(2.2, 8.0));
	}

}

class Rectangle {
	double length;
	double width;

	// public Rectangle() {
	// System.out.println("Nothing to say!");
	// }

	public Rectangle(double length, double width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
		System.out.println("I'm your father!");
	}

	public double areaOfFigure() {
		return this.length * this.width;
		// this points to current instance, so can't appear in static func.
	}
}

class Square extends Rectangle {

	public Square(double length, double width) {
		super(length, width);
		// 1 Constructor call must be the first statement in a constructor.
		// 2 if you set constructor with args in BaseClass, default constructor will
		// vanish.
		// 3 if you don't use 'super()' or 'super(...args)' in SonClass, System will
		// call BaseClass at the beginning of constructor automatically.
		// 4 REMBER that SonClass can't INHERIT the constructor of BaseClass, but
		// Sonclass can USE it.
		// 2 and 3 will lead to raise error if you don't use 'super(...args)' explicitly
		// in SonClass except that you define a no-args constructor in BaseClass.
		if (isSquare(length, width)) {
		} else {
			System.out.println("Input Wrong!");
		}
	}

	public static boolean isSquare(double x, double y) {
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}

	public static double areaOfFigure(double x, double y) {
		return x * y;
	}
}
