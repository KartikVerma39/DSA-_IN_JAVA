public class BinaryToDecimal {
    public static void main(String[] args){
        String s = "1001";
        int decimal = 0;
        int power = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            int digit = s.charAt(i) - '0';
            decimal += digit * Math.pow(2 , power);
            power++;
        }

        System.out.println(decimal);
    }
}
