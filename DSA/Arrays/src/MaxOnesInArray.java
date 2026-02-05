public class MaxOnesInArray {
    public static void main(String[] args){
        int[] arr = {1,1,1,0,1,1,0,1,1,1,1,1};
        int maxOnes = 0;
        int ones = 0;
        for(int it:arr){
            if(it == 1){
                ones++;
            }
            else{
                ones = 0;
            }
            maxOnes = Math.max(maxOnes , ones);
        }

        System.out.println(maxOnes);
    }
}
