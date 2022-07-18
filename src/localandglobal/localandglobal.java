package localandglobal;

class localandglobal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.dogAge);
        
    }
}   
    class Dog{
        // global because the variable is outside the mehtod 
        int dogAge = 5;
        Dog(){
            //local because inside constructor which is considered a method
            String name = "Apollo";
            System.out.println(name);
        }
    }


