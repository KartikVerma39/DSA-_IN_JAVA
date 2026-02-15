import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int columns = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;

        while(left <= right && top <= bottom){
            for(int i = left ; i <= right ; i++){
                ans.add(arr[top][i]);
            }
            top++;

            for(int i = top ; i<= bottom ; i++){
                ans.add(arr[i][right]);
            }
            right--;


            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i = bottom ; i >= top ; i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }

        }


        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
