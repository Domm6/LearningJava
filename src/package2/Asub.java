package package2;
import package1.*;

public class Asub extends A{
    public static void main(String[] args) {
        C c = new C();
        A a = new A();
        Asub asub = new Asub();
        System.out.println(c.defaultMessage);
        System.out.println(asub.protectedMessage);
    }    
    
}
