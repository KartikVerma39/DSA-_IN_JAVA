public class FibionnaciSeries {
    public static void main(String[] args){
        int n = 3;
        System.out.println(Fibionnaci(n));
    }

    public static int Fibionnaci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return  Fibionnaci(n - 1) + Fibionnaci(n - 2);
    }
}
