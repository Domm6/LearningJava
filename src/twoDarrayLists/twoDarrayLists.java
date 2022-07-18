package twoDarrayLists;
import java.util.ArrayList;

class twoDarrayLists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>>householdItems = new ArrayList<ArrayList<String>>();


        ArrayList<String> bathroom = new ArrayList<String>();
        bathroom.add("Soap");
        bathroom.add("Towel");
        bathroom.add("Toilet Paper");

        ArrayList<String> bedroom = new ArrayList<String>();
        bedroom.add("Bed");
        bedroom.add("Night Stand");
        bedroom.add("Charger");

        ArrayList<String> livingroom = new ArrayList<String>();
        livingroom.add("Tv");
        livingroom.add("Couch");
       


        householdItems.add(bathroom);
        householdItems.add(bedroom);
        householdItems.add(livingroom);

        System.out.println("This is the most useful thing in my room: ");

        System.out.println(householdItems.get(1).get(2));

        System.out.println("This is a list of important items within my household");

        System.out.println("This is horizontal list: ");

        System.out.println(householdItems);

        System.out.println("This is a vertical list: ");

        for(int i = 0; i < householdItems.size(); i++){
            System.err.println(householdItems.get(i));
            }

        System.out.println("This is a list of the compenents in my computer setup: ");

        String[][] setup = {{"headphones", "airpods", "speakers"}, {"headset mic", "blue yeti"}, {"magic keyboard", "razer huntsman"}};

        for(int l = 0; l < setup.length; l++){
            System.out.println();
            for(int j = 0; j < setup[l].length; j++){
                System.out.print(setup[l][j] + " ");
            }
        }


        
    }
}
