package nestedLoops;
import java.util.Scanner;

class nestedLoops {
    public static void main(String[] args) {
        int rows;
        int columns;
        String symbol = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows would you like? ");
        rows = scanner.nextInt();
        System.out.println("How many columns would you like? ");
        columns = scanner.nextInt();
        System.out.println("What symbol would you like to use? ");
        symbol = scanner.next();

        for(int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
                scanner.close();
        }


    }
}
