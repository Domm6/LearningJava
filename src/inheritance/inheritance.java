package inheritance;
class inheritance {

    String members;
    boolean close;

    public static void main(String[] args) {
        brothers brothers = new brothers();
        brothers.hangOut();
        brothers.arguing();

        pets pets = new pets();
        pets.arguing();
        System.out.println(brothers.areHumans);
        System.out.println(pets.areAnimals);
    }

    void hangOut(){
        System.out.println("The members are hanging out!");

    
    }
    void arguing(){
        System.out.println("The members are arguing!");
    }
}
    class brothers extends inheritance{
        String areHumans = "The brothers are young humans";
       
    }

    class pets extends inheritance{
        String areAnimals = "The pets are animals";
    }
