public class DecimalToBinary {
    public static void main(String[] args){
        int num = 21;
        StringBuilder binary = new StringBuilder();
        if(num == 0){
            System.out.println("0");
            return;
        }

        while(num!=0){
            int rem = num%2;
            binary.append(rem);
            num = num/2;
        }

        System.out.println(binary.reverse().toString());

    }
}
