public class PowOfX {
    public static void main(String[] args){
        int x = 2;
        int n = 4;

        System.out.println(power(x , n));
    }

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        if(n > 0){
            return x*power(x , n - 1);
        }
        else {
            return x * power(x, n + 1);
        }
    }
}
