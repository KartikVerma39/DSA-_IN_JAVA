public class CheckIfArrayIsSorted {
    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};

        int count = 0;

        if(arr[0] < arr[arr.length - 1]){
            count++;
        }

        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }

        if(count > 1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}
