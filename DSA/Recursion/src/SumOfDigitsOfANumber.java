public class SumOfDigitsOfANumber {
    public static void main(String[] args){
        int number = 456;
        int sumOfNumber = sumNumber(number);
        System.out.println(sumOfNumber);
    }

    public static int sumNumber(int number){
        if(number < 10){
            return number;
        }
        return number%10 + sumNumber(number/10);
    }
}
