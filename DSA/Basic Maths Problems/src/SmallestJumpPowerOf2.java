public class SmallestJumpPowerOf2 {
    public static void main(String[] args){
        int num = 8;
        int smallestPower = 0;
        while(num>0){
            int power = 1;
            while(power*2 <= num){
                power = power * 2;
            }
            smallestPower = power;
            num = num - power;
        }

        System.out.println(smallestPower);
    }
}
