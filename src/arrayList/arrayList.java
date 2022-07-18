package arrayList;
import java.util.ArrayList;

class arrayList {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Tesla");
        cars.add("Honda");
        cars.add("Sonata");



        for(int i = 0; i < cars.size(); i++){

            System.out.println(cars.get(i));

        }

        System.out.println(cars);

    }
}
