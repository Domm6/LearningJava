package dynamicPolymorphism;

import java.util.Scanner;

class dynamicPolymorphism {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Animal animal;

    System.out.println("What animal would you like ");
    System.out.print("Choose betwwen a dog, cat, and bear! ");
    String animalChoice = scanner.nextLine();

    if(animalChoice.equalsIgnoreCase("dog")){
        animal = new Dog();
            animal.speak();
        } else if (animalChoice.equalsIgnoreCase("cat")){
        animal = new Cat();
        animal.speak();
        } else if (animalChoice.equalsIgnoreCase("bear")){
            animal = new Bear();
            animal.speak();
        } else {
            System.out.println("That was not one of the animal choices.");
        }

} 
    
}
    class Animal{
         void speak(){}
    }
        class Dog extends Animal{
            void speak(){
                System.out.println("The dog goes *bark*");
            }
        }
        
        class Cat extends Animal{
            void speak(){
                System.out.println("The cat goes *meow*");
            }
        } 

        class Bear extends Animal{
            void speak(){
                System.out.println("The bear goes *rawr*");
            }
        }
