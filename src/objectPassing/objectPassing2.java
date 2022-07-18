package objectPassing;
class objectPassing2 {
    public static void main(String[] args) {
        Garage mainGarage = new Garage("Main Garage", "lage", "white");
        Car tesla = new Car("Tesla", true, "space grey");

        mainGarage.park(tesla);
    }
}

    class Garage{
        Garage(){}
        String garageName;
        String size;
        String color;
        Garage(String garageName, String size, String color){
            this.garageName = garageName;
            this.size = size;
            this.color = color;
        }

        void park(Car car){
            System.out.println("The " + car.name + " is parked in the ");
        }

    }

    class Car{
        Car(){}
        String name;
        boolean brandnew;
        String color;
        Car(String name, boolean brandnew, String color){
            this.name = name;
            this.brandnew = brandnew;
            this.color = color;

        }
    }
