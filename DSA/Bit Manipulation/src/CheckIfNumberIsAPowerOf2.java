public class CheckIfNumberIsAPowerOf2 {
    public static void main(String[] args){
        int n = 30;
        if(n<=0){
            System.out.println("False");
        }
        if(((n & n-1) == 0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
