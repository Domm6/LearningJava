package objects;
class objects {

    public static void main(String[] args) {

    family parkerFamily = new family();

    System.out.println(parkerFamily.close);
    for(String i : parkerFamily.members){
        System.out.print(i + " ");
    }
    System.out.println();
    for(int i : parkerFamily.ages){
        System.out.print(i + " ");
    }
    System.out.println(parkerFamily.numberOfPeople);

    
        
    }
}


    class family{
        String[] members = {"Damien", "Dominic", "Devan", "Patricia", "Louis"};
        int numberOfPeople = 5;
        int ages[] = {18, 19, 15, 42, 44};
        boolean close = true;

        void hangOut(){
            System.out.println("The family is hanging out!");
        }

        void watchingMovie(){
            System.out.println("The family is watching a movie together!");
        }

    }

