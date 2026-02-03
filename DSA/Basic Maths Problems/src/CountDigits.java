import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){

        int num;
        int temp;
        int digits = 0;
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        temp = num;

        while(temp!=0){
            temp = temp/10;
            digits++;
        }

        System.out.println(digits);
        scanner.close();
    }
}
