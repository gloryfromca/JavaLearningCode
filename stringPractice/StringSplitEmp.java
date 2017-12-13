package stringPractice;

public class StringSplitEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "www-runoob-com";
		String [] temp;
		String delimeter = "-";
		temp = str.split(delimeter);
		// don't put String [] at head when assignment happens after str already has been defined.
		System.out.println("Output value splited:");
		
		for (int i=0;i<temp.length; i++) {
			/*
			i wasn't defined before using, 
			you must need put type of variable at head of the line.
			*/
			// ; in "for" clause not ,
			System.out.println(temp[i]);
		}
		str = "www.runoob.com.cc";
		// if you want to use variable once again, duplicated declaration is questionable.
		/* you can replace string in variable of String type with another string.
		 * it's same for String[]
		*/
		delimeter = "\\.";
		/*
		 * you need to escape . using double backslash
		 */
		temp = str.split(delimeter);
		System.out.println(temp.length);
		
		System.out.println("Output value splited:");
		for (String x: temp) {
			System.out.println(x);
		}
		
	}

}
