import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a == b){
            System.out.println(a);
            return;
        }

        while(a > 0 && b > 0){
            if(a > b){
                a = a%b;
            }
            else if(b > a){
                b = b%a;
            }
        }

        if(a == 0){
            System.out.println(b);
        }
        else{
            System.out.println(b);
        }

        scanner.close();
    }
}
