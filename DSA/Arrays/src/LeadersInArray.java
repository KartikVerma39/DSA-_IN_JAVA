import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args){
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int largest = arr[n-1];
        ans.add(arr[n-1]);

        for(int i = n - 2 ; i>=0 ; i--){
            if(arr[i] > largest){
                largest = arr[i];
                ans.add(arr[i]);
            }
        }

        Collections.reverse(ans);

        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
