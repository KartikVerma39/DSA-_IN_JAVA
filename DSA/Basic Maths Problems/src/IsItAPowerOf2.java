public class IsItAPowerOf2 {
    public static void main(String[] args){
        int num = 6;

        if(num<=0){
            System.out.println("False");
            return;
        }

        while(num>1){
            if(num%2!=0){
                System.out.println("False");
                return;
            }
            num = num / 2;
        }

        System.out.println("True");
    }
}
