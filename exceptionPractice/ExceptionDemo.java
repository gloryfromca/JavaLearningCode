package exceptionPractice;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("Error Message!");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Caught Exception");
			System.err.println("getMessage():"+e.getMessage());
			System.err.println("getLocalizedMessage():"+e.getLocalizedMessage());
			System.err.println("toString()"+e);
			System.err.println("printStackTrace():");
			e.printStackTrace();
		}
	}

}
