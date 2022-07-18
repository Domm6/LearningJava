package forEachLoop;
import java.util.ArrayList;

class forEachLoop {
    public static void main(String[] args) {
        
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(11);

        System.out.println("Here is a list of odd numbers: \n");
    

        for(Integer i : oddNumbers){
            System.out.println(i);
        }


        String[] dogNames = {"Apollo", "Zo", "Chandler", "Billy"};

        System.out.println("\nHere is a list of dog names that I like: \n");

        for(String i : dogNames){
            System.out.println(i);
        }


    }
}
