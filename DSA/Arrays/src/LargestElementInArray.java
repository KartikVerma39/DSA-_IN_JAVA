public class LargestElementInArray {
    public static void main(String[] args){
        int[] arr = {3,4,59,1,45,32,99};

        int maxEle = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            maxEle = Math.max(maxEle , arr[i]);
        }

        System.out.println(maxEle);
    }
}
