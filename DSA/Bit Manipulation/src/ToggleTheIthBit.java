public class ToggleTheIthBit {
    public static void main(String[] args){
        int n = 9;
        int i = 2;
        n = (n ^ (1 << i));
        System.out.println(n);
    }
}
