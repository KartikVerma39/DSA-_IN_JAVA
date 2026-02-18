public class SetTheIthBit {
    public static void main(String[] args){
        int n = 2;
        int i = 2;
        n = (n | (1 << i));
        System.out.println(n);
    }
}
