package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

class exceptionHandling {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
        try{
            System.out.print("Please enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.print("Please enter a whole number to divide by: ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println(z);              
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid whole number: ");
        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by 0.");
        } 
        catch (Exception e ){
            System.out.println("Something went wrong.");
        }
        finally{
            scanner.close();
        }
        
        
    }

    
}
