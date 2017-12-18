package exceptionPractice;

class Demo{
	int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		int [] temp = new int[a];
		System.out.println(temp[4]);
		return a/b;
	}
}

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo(); 
		try {
			//demo.div(3, 0);
			//demo.div(5, 0);
			demo.div(5, 1);
			
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
