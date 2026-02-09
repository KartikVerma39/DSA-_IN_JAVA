public class MajorityElement {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2,2};
        int start = 0;
        int element = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(start == 0){
                element = arr[i];
                start = 1;
            }
            else if(arr[i] == element){
                start++;
            }
            else{
                start--;
            }
        }


        System.out.println(element);
    }
}
