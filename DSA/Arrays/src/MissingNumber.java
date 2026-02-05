public class MissingNumber {
    public static  void main(String[] args){
        int[] arr = {3,0,1};
        int n = arr.length;
        int totalSum = 0;
        int arrSum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            arrSum += arr[i];
        }

        for(int i = 0 ; i <= n ; i++){
            totalSum += i;
        }

        System.out.println(totalSum - arrSum);
    }
}
