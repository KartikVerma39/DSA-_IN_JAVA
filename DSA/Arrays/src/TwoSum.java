import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0] , 0);
        int[] arr = new int[2];


        for(int i = 1 ; i < nums.length ; i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                arr[0] = map.get(need);
                arr[1] = i;
                break;
            }
            map.put(need , i);
        }

        for(int i  = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
