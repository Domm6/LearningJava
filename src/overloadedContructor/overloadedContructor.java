package overloadedContructor;
class overloadedContructor{
    public static void main(String[] args) {
        Pizza pizza = new Pizza("peporoni", true);
        System.out.println(pizza.crust);

        System.out.println(pizza.size);

        System.out.println(pizza.topping);
        
    }
}

    class Pizza{
        String topping;
        boolean crust;
        String cheeseType;
        String size;
        int amount;


        Pizza(String topping, boolean crust, String cheeseType, String size, int amount){
            this.topping = topping;
            this.crust = crust;
            this.cheeseType = cheeseType;
            this.size = size;
            this.amount = amount;
        }
        Pizza(String topping, boolean crust, String cheeseType, String size){
            this.topping = topping;
            this.crust = crust;
            this.cheeseType = cheeseType;
            this.size = size;
        }
        Pizza(String topping, boolean crust, String cheeseType){
            this.topping = topping;
            this.crust = crust;
            this.cheeseType = cheeseType;
        }
        Pizza(String topping, boolean crust){
            this.topping = topping;
            this.crust = crust;
        }
        Pizza(String topping){
            this.topping = topping;
        }




        }
