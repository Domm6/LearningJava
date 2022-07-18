package superKeyword;
class superKeyword {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Spider Man ", 19, "shoot webs");
        Person person1 = new Person("Henry", 19);
        Ordinary ordinary1 = new Ordinary("Jack", 24);
    
        System.out.println(ordinary1.toString()); 
        System.out.println(person1.toString()); 
        System.out.println(hero1.toString());

        
    }
}
    class Person{
        String name;
        int age;
         
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String toString(){
            return this.name + " " + this.age;

        }

    }

    class Hero extends Person{
        String power;

        Hero(String name, int age, String power){
            super(name, age);
            this.power = power;

        }

        public String toString(){
            return super.toString() + " " + this.power;
        }
    }

    class Ordinary extends Person{
        String power = "none";

        Ordinary(String name, int age){
            super(name, age);
        }
        public String toString(){
            return super.toString() + " " + power;
        }

    }


