package stringMethods;
class stringMethods {
    public static void main(String[] args) {
    
        String car = "Tesla";
        String age = "My age is currently 18 years old.";

        boolean result = car.equalsIgnoreCase("tesla");
        String resultTwo = car.toUpperCase();
        int carLength = car.length();
        char character = car.charAt(3);
        int index = car.indexOf("s");
        String replace = age.replace('1', '2');
        

        System.out.println(result);
        System.out.println(resultTwo);
        System.out.println(carLength);
        System.out.println(character);
        System.out.println(index);
        System.out.println(age);
        System.out.println(replace);


    }
}
