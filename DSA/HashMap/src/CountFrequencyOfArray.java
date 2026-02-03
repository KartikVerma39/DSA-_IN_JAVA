import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfArray {
    public static void main(String[] args){

        int[] arr = {1,2,3,3,5};

        HashMap<Integer,Integer>mpp = new HashMap<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int it : arr){
            mpp.put(it , mpp.getOrDefault(it,0) + 1);
        }


        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            result.add(temp);
        }

    }
}
