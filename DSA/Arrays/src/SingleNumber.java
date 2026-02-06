public class SingleNumber {
    public static void main(String[] args){
        int[] arr = {4,4,2,1,2,3,3};
        int num = 0;
        for(int it : arr){
            num ^= it;
        }
        System.out.println(num);
    }
}
