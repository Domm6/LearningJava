package methodOverload;
import java.util.Scanner;

class methodOverload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numer to be multiplied: ");

        int x = multiply(scanner.nextInt(), scanner.nextInt());
        System.out.println(x);

        System.out.println("Please enter three numbers to be multiplied: ");

        int y = multiply(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(y);

        scanner.close();
        
}

 static int multiply(int a, int b){
        System.out.println("This is method 1: ");
        return a * b;
    }

    static int multiply(int a, int b, int c){
        System.out.println("This is method overlaod 1: ");
        return a * b * c;
    }



}