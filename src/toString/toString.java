package toString;
class toString {
    public static void main(String[] args) {
        Food healthy = new Food("apple", "lemonade", "fork", 12, true);
        System.out.println(healthy);
        
    }
}
    class Food{
        String fruit;
        String beverage;
        String device;
        int price;
        boolean isFresh;

        Food(String fruit, String beverage, String device, int amount, boolean isFresh){
            this.fruit = fruit;
            this.beverage = beverage;
            this.price = amount;
            this.isFresh = isFresh;
            this.device = device;

            System.out.println("These are your foods ");
        }

        public String toString(){
            return fruit + "\n" + beverage + "\n" + device + "\n" + price + "\n" + isFresh;
    }
}
