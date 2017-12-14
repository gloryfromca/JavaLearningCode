package functionPractice;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

enum Car {
	lamborghini, tata, audi, fiat, honda
}

public class EnumSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = Car.tata;
		// strange usage.
		switch (c) {
		case tata:
			System.out.println("you choose tata!");
			break;
		default:
			System.out.println("see you again!");
			break;
		}
	}

}
