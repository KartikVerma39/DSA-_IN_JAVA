import java.util.ArrayList;

class Solution2 {
    public static void print_divisors(int n) {

        ArrayList<Integer> divisor = new ArrayList<>();


        for(int i = 1 ; i*i <= n ; i++){
            if(n%i == 0){
                System.out.print(i + " ");
                if(i != n/i){
                    divisor.add(n/i);
                }
            }
        }

        for(int i = divisor.size() - 1 ; i>=0 ; i--){
            System.out.print(divisor.get(i) + " ");
        }
    }
}
