package logicalOperators;
import java.util.Scanner;

class logicalOperators{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have reached the end of the level. If you would like to quit the game please click 'q' or 'Q' on the keyboard. Otherwise, click any ohter key to continue playing the game.");

        String playerResponse = scanner.next();

        if(playerResponse.equals("q") || playerResponse.equals("Q")){
            System.out.println("You have successfully exited the game. We hope you had a great time! ");
        } else {
            System.err.println("You are now entering a new level!");
        }

        scanner.close();
        
    }
}