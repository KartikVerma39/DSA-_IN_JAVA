import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int rev = 0;
        num = scanner.nextInt();
        int temp = num;

        if(num < 0 || (num%10 == 0 && num!=0)){
            System.out.println("False");
        }

        while(temp!=0){
            int rem = temp%10;
            rev = rev * 10 + (rem);
            temp = temp/10;
        }


        if(rev == num){
            System.out.println("True");
        }
        else if(rev != num){
            System.out.println("False");
        }
    }
}
