package stringPractice;

public class StringOptimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int _length = 50000;
		String [] strs = new String[_length];
		for(int i=0; i<_length; i++) {
			strs[i] = "s" + i;
		}
		long startTime = System.currentTimeMillis();
		for (int i=0; i<_length; i++) {
			strs[i] = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time consumed 0:" + (endTime - startTime));
		long startTime1 = System.currentTimeMillis();
		for (int i=0; i<_length; i++) {
			strs[i] = strs[i].intern();
			/* On one hand, it is true that you can remove String duplicates by internalizing them. 
			 * The problem is that the internalized strings go to the Permanent Generation, 
			 * which is an area of the JVM that is reserved for non-user objects, like Classes, 
			 * Methods and other internal JVM objects. The size of this area is limited, and is usually much smaller than the heap. 
			 * Calling intern() on a String has the effect of moving it out from the heap into the permanent generation, 
			 * and you risk running out of PermGen space.
			 */
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("time consumed 1:" + (endTime1 - startTime1));
	}
	

}
