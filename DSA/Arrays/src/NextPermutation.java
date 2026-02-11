public class NextPermutation {
    public static void main(String[] args){
        int[] arr = {1,1,5};

        int index = -1;
        int n = arr.length;

        for(int i = n - 2 ; i >= 0 ; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            int start = 0;
            int end = n - 1;

            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[start] = temp;
                start++;
                end--;
            }

            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i] + " ");
            }
            return;
        }


        for(int i = 0 ; i < n ; i++){
            if(arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
