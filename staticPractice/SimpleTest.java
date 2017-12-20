package staticPractice;

public class SimpleTest extends Base{
	 
    static{
        System.out.println("test static");
    }
     
    public SimpleTest(){
        System.out.println("test constructor");
    }
     
    public static void main(String[] args) {
        new SimpleTest();
    }
}
 
class Base{
     
    static{
        System.out.println("base static");
    }
     
    public Base(){
        System.out.println("base constructor");
    }
}