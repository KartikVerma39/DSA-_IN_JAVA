import java.util.HashMap;

public class DiffInMinAndMaxFreq {
    public static void main(String[] args){

        int[] arr = {2,1,2,1,4,5,6,2};
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int it : arr){
            map.put(it , map.getOrDefault(it , 0) + 1);
        }


        for(int it:map.values()){
            minFreq = Math.min(it,minFreq);
            maxFreq = Math.max(it,maxFreq);
        }


        System.out.println(maxFreq - minFreq);
    }
}
