package methods;

class methods {

    public static void main(String[] args) {
        int x = 15;
        int y = 12;

        System.out.println(multiply(x, y));
        System.out.println(add(12, 35));
    }

    static int multiply(int firstNumber, int secondNumber){
        int z = firstNumber * secondNumber;
        return z;
    }

    static int add(int firstNumber, int secondNumber){
        int answer = firstNumber + secondNumber;
        return answer;
    }
    
}
