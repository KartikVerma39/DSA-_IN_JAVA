class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int num = 0;
        int digit = digits(temp);

        while(temp!=0){
            int rem = temp%10;
            num += Math.pow(rem,digit);
            temp /= 10;
        }

        if(num == n){
            return true;
        }
        else{
            return false;
        }

    }

    static int digits(int n){
        int dig = 0;
        while(n!=0){
            n /= 10;
            dig++;
        }
        return dig;
    }
}