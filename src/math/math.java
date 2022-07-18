package math;
import java.util.Scanner;

class math {
    public static void main(String[] args){
        double firstSide;
        double secondSide;
        double hypotenuseSide;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side firstSide: ");
        firstSide = scanner.nextDouble();
        System.out.println("Enter side secondSide: ");
        secondSide = scanner.nextDouble();

        // z = Math.sqrt((x*x)+(y*y));
        hypotenuseSide = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
        System.out.println("The hypotenuse is: " + hypotenuseSide);
        
        scanner.close();



    }
    
}
