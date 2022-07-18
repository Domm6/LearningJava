package statement;
import java.util.Scanner;

class statement {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("How much money are you making Dom? ");
    
    int domSalary = scanner.nextInt();

   

    if (domSalary >= 100000) {
        System.out.println("Dom is living the good life!");

    } else if(domSalary >= 75000){
        System.out.println("Dom is living an average life.");
        
    } else if(domSalary <= 75000){
        System.out.println("Dom is living a not so good life.");
        
        scanner.close();
     }
  }
}
