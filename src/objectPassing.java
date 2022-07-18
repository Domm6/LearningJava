/* 
public class objectPassing{
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", true, "Space Grey");
        Garage mainGarage = new Garage("Main Garage", "large", "white");

        System.out.println("Please print something!!");

        System.out.println(mainGarage.car);
        mainGarage.park(tesla);
    }    
}


    class Garage{
        String garageName;
        String size;
        String color;
        Car car;
        Garage (String garageName, String size, String color){
            this.garageName = garageName;
            this.size = size;
            this.color = color;
            System.out.println("The " + garageName + " is " + size + " and is " + color);
        }

        void park(Car car){
            System.out.println("The " + car.name + " is parked in the " + garageName);
        }
    }

    class Car{
    
        String name;
        boolean brandnew;
        String color;

        Car(String name, boolean brandnew, String color){
            this.name = name;
            this.brandnew = brandnew;
            this.color = color;

            /*if(brandnew == true){
                System.out.println(" is brand new");
            } else {
                System.out.println(" is not brand new");
            }

            System.out.println("The " + name + " is " + brandnew + " and the color " + color);
        }



    }*/