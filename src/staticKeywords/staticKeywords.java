package staticKeywords;


class staticKeywords {
    public static void main(String[] args) {
        Friends friend1 = new Friends("Ryan");
        Friends friend2 = new Friends("Danny");

        System.out.println(Friends.numbeOfFreinds);
        Friends.displayFriends();

    }
}
    class Friends{
        String name; 
        static int numbeOfFreinds;

        Friends(String name){
            this.name = name;
            numbeOfFreinds++;
        }

        static void displayFriends(){
            System.out.println("You have " + numbeOfFreinds + " friends!");
        }


        
    }
        