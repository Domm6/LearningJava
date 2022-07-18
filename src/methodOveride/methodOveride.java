package methodOveride;
class methodOveride{
    public static void main(String[] args) {
        Car car = new Car();
        Corvette corvette = new Corvette();
        Prius prius = new Prius();

        car.driving();
        prius.driving();
        corvette.driving();

    }
}
    
    class Car{
        Car(){}
        void driving(){
            System.out.println("The car is driving.");
        }
    }

    class Prius extends Car{
        Prius(){}
        //Override 
        void driving(){
            System.out.println("The prius is driving extremely slow....");
        }
    }

    class Corvette extends Car{
        Corvette(){}
        //Override
        void driving(){
            System.out.println("The corvette is speeding extremely fast!");
        }
    }