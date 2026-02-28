public class FactorialOfANumber {
    public static void main(String[] args){
        int n = 5;
        int factor = factorial(n);
        System.out.println(factor);
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
