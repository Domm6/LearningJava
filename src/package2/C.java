package package2;
import package1.*;

public class C {

    String defaultMessage = "This is a default message.";
    public String publicMessage = "This string is public in the c class";
    private String privateMessage = "This string is private and only visible to the the C class.";

    public static void main(String[] args) {
        C c = new C();
        
        System.out.println(c.privateMessage);
    }
    
}
