public class RearrangeElementsBySign {
    public static void main(String[] args){
        int[] nums = {5,9,-2,-1,4,5,-9,-6};
        int[] arr = new int[nums.length];

        int even = 0;
        int odd = 1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                arr[even] = nums[i];
                even += 2;
            }
            else if(nums[i] < 0){
                arr[odd] = nums[i];
                odd += 2;
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
