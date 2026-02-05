import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.TreeSet;

public class Union {
    public static void main(String[] args){
        int[] a = {3,4,2,1,4};
        int[] b = {1,2,5,6,7};
        TreeSet<Integer> set = new TreeSet<>();

        for(int it:a){
            set.add(it);
        }

        for(int it:b){
            set.add(it);
        }

        ArrayList<Integer> arr = new ArrayList<>(set);

        for(int it:arr){
            System.out.print(it + " ");
        }




    }
}
