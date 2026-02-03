class Solution3 {
    static boolean isPrime(int n) {
        // code here

        if(n == 1 || n == 0){
            return false;
        }

        int divisors = 0;
        for(int i = 2 ; i <= n ; i++){
            if(n%i == 0){
                divisors++;
            }
        }


        if(divisors < 2){
            return true;
        }
        else{
            return false;
        }
    }
}