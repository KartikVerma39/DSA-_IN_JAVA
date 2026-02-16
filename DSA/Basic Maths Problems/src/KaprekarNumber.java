public class KaprekarNumber {
    public static void main(String[] args){
        int n = 13;
        if(n == 1){
            System.out.println(1);
            return;
        }
        int num = n*n;
        boolean flag = false;
        String s = String.valueOf(num);

        for(int i = 1 ; i < s.length() ; i++){
            String left = s.substring(0,i);
            String right = s.substring(i);

            int l = Integer.parseInt(left);
            int r = Integer.parseInt(right);

            if(r!=0 && l + r == n){
                flag = true;
            }
        }

        if(flag){
            System.out.println(1);
            return;
        }
        else{
            System.out.println(0);
            return;
        }

    }
}
