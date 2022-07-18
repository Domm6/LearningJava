package Abstraction;

class abstraction{
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        ElectricScooter electricScooter = new ElectricScooter();
        bike.go();
        car.go();
        electricScooter.go();

    }
}
abstract class Vehicle{
    abstract void go();
}

    class Car extends Vehicle{
        void go(){
            System.out.println("The car is driving!");
        }
    }

    class Bike extends Vehicle{
        void go(){
            System.out.println("The bike is riding!");
        }
    }

    class ElectricScooter extends Vehicle{
        void go(){
            System.out.println("The electric scooter is riding!");
        }
 
    }