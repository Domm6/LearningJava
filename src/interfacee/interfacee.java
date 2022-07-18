package interfacee;
class interfacee {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Whale whale = new Whale("Blue", 500);
        Fish fish = new Fish();
        shark.flee();
        shark.hunt();
        System.out.println(whale.color);
    }
    
}
    class Whale implements Predator{
        String color;
        int weight;

        Whale(String color, int weight){
            this.color = color;
            this.weight = weight;
        }


        @Override
        public void hunt() {
            System.out.println("The whale is hunting its prey! It is looking for a meal.");            
        }
    }
    class Shark implements Predator, Prey{
        @Override
        public void hunt() {
            System.out.println("The shark is hunting its prey which is smaller fish. ");
        }

        @Override
        public void flee() {
            System.out.println("The shark is fleeing from its predators which are larger than itself.");            
        }

    }
    class Fish implements Prey{

        @Override
        public void flee() {
            System.out.println("The fish is fleeing away from its predator. It does not want to get hunted and die!");

        } 

    }
        interface Predator{
            void hunt();
        }
        interface Prey{
            void flee();
        }
