public class SortColours {
    public static void main(String[] args){
        int[] arr = {2,1,0,1,2};
        int first = 0;
        int second = 0;
        int third = arr.length - 1;
        while(second<=third){
            if(arr[second] == 0){
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
                first++;
                second++;
            }
            else if(arr[second] == 1){
                second++;
            }
            else{
                int temp = arr[second];
                arr[second] = arr[third];
                arr[third] = temp;
                third--;
            }
        }

        for(int it:arr){
            System.out.println(it + " ");
        }
    }
}
