package userInput;
import java.util.Scanner;

class userInput {
    public static void main(String[] args) {
        System.out.println("I am about to learn how to accept and use user inputs using a scanner");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, to begin with, what is your name? ");

        String name = scanner.nextLine();

        System.out.println("Welcome " + name);

        System.out.println("What grade are you currenty in? ");

        int gradeLevel = scanner.nextInt();

        System.out.println("That is great! Next year you will be in " + (gradeLevel + 1) + "th grade.");
        

        System.out.println("If you are in college, what do you plan to major in?");
        
        scanner.nextLine();

        String major = scanner.nextLine();

        System.out.println("That is fantastic! Hopefully " + major + " is a great fit for you!");

        scanner.close();

    }
}
