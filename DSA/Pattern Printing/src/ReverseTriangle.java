import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = n ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
