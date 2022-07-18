package whileLoop;
import java.util.Scanner;

class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        

        while(name.isBlank()){
            System.out.println("Hello, what is your name so we can better assist you. ");
            name = scanner.nextLine();
        }

        System.out.println("Welcome " + name + ". We are glad to help you.");

        scanner.close();
    }
    
}
