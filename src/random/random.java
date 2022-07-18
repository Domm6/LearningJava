package random;
import java.util.Random;

class random {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(18)+1;
        System.out.println(age);
        double randomBoolean = random.nextExponential();
        System.out.println(randomBoolean);
    }    
}
