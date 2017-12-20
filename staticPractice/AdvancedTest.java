package staticPractice;

public class AdvancedTest {
    PersonA person = new PersonA("Test");
    static{
        System.out.println("test static");
    }
     
    public AdvancedTest(String A) {
        System.out.println("test constructor with input:"+A);
    }

     
    public static void main(String[] args) {
        new SuperClass();
    }
}
 
class PersonA{
    static{
        System.out.println("person static");
    }
    public PersonA(String str) {
        System.out.println("person "+str);
    }
}
 
 
class SuperClass extends AdvancedTest {
    PersonA person = new PersonA("MyClass");
    static{
        System.out.println("myclass static");
    }
     
    public SuperClass() {
    	super("Here!");
        System.out.println("myclass constructor");
    }
}
