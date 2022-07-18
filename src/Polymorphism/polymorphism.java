package Polymorphism;
public class polymorphism {
    public static void main(String[] args) {
        Car bmw = new Car();
    Bike bmx = new Bike();
    Boat harley = new Boat();

    Vehicle[] racers = {bmw, bmx, harley};

    for(Vehicle i : racers){
        i.go();
        i.stop();
    }
    
    }     
}

    abstract class Vehicle{
        void go(){}
        void stop(){}
    }

        class Car extends Vehicle{
            void go(){
                System.out.println("The car is driving down the street.");
            }
            void stop(){
                System.out.println("The car has stopped driving. ");
            }
        }

        class Bike extends Vehicle{
            void go(){
                System.out.println("The bike is riding down the street");
            }
            void stop(){
                System.out.println("The bike has stopped");
            }
        }

        class Boat extends Vehicle{
            void go(){
                System.out.println("The boat is coasting down the river.");
            }
            void stop(){
                System.out.println("The boat has stopped.");
            }
        }
