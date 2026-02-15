import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args){
        int[] arr = {1,1,1};
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            int needed = sum - k;


            if(map.containsKey(needed)){
                count = count + map.get(needed);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        System.out.println(count);
    }
}
