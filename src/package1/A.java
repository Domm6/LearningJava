package package1;
import package2.*;

public class A {
    protected String protectedMessage = "This is a protected string within the A class.";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
    
}
