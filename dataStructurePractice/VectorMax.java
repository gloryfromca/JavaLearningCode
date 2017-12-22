package dataStructurePractice;

import java.util.Collections;
import java.util.Vector;

public class VectorMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> s = new Vector<Double>();
		s.add(0.13);
		s.add(1.8);
		s.add(7.3);
		Double max = Collections.max(s);
		System.out.println("max:" + max);
	}

}
