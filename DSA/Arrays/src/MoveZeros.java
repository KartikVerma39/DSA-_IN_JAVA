public class MoveZeros {
    public static void main(String[] args){
        int[] arr = {0,1,0,4,3,4,2};
        int start = 0;
        int index = 0;
        while(start<arr.length){
            if(arr[start] != 0){
                int temp = arr[start];
                arr[start] = arr[index];
                arr[index] = temp;
                index++;
            }
            start++;
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
