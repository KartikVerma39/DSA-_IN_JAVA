import java.util.HashSet;
import java.util.Set;

public class LongestSequenceInArray {
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};
        Set<Integer> set = new HashSet<>();
        for(int it:arr){
            set.add(it);
        }
        int longest = 0;

        for(int it:set){
            if(!set.contains(it - 1)){
                int x = it;
                int count = 1;
                while(set.contains(x + 1)){
                    x = x + 1;
                    count++;
                }
                longest = Math.max(count,longest);
            }
        }

        System.out.println(longest);
    }
}
