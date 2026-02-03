import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        int rev = 0;
        num = scanner.nextInt();

        int temp = num;


        while(temp!=0){
            int rem = temp%10;
            rev = rev * 10 + (rem);
            temp /= 10;
        }

        System.out.println(rev);

    }
}
