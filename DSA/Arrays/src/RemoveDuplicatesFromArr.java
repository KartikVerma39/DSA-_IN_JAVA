public class RemoveDuplicatesFromArr {
    public static  void main(String[] args) {
        int[] arr = {1 , 1 , 2 , 4 , 5 , 5 };
        int left = 0;
        int index = 0;
        while (left < arr.length) {
            if (arr[left] != arr[index]) {
                index++;
                int temp = arr[left];
                arr[left] = arr[index];
                arr[index] = temp;
            }
            left++;
        }


        for(int i = 0 ; i < index + 1 ; i++){
            System.out.println(arr[i]);
        }
    }
}

