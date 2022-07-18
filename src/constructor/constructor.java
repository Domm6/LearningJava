package constructor;

class constructor {
    public static void main(String[] args) {
        Car Hyundai = new Car(2013, "Hyundai", "Sonata", 5, true, 4);
        
        System.out.println(Hyundai.seats);
        System.out.println(Hyundai.used);
        Hyundai.driving();
        System.out.println(Hyundai.hybrid);


    }
}

    class Car{
        int year;
        String model;
        String make;
        int seats;
        boolean used;
        int doors;
        boolean hybrid = true;

        Car(int year, String model, String make, int seats, boolean used, int doors){
            this.year = year;
            this.model = model;
            this.make = make;
            this.seats = seats;
            this.used = used;
            this.doors = doors;
        

            System.out.println("The car contains: ");

        }

        void driving(){
            System.out.println("The " + this.model + " " + this.make + "is driving around town at super high speeds!");

        }
    }
