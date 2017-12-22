package dataStructurePractice;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class SwapVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(23);
		v.add(4);
		System.out.println("before:"+v);
		Collections.swap(v, 0, 2);
		System.out.println("after:"+v);
		

	}

}
