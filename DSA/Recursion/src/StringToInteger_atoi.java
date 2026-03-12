public class StringToInteger_atoi {
    public static void main(String[] args){
        String s = "   -042";
        System.out.println(stringToInteger(s));
    }

    public static int stringToInteger(String s){
        int sign = 1;
        int i = 0;
        s = s.trim();
        if(s.length() == 0) {
            return 0;
        }

        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            else if(s.charAt(i) == '+'){
                sign = 1;
            }
            i++;
        }

        return recStringToInteger(s , sign , 0 , i);
    }

    private static int recStringToInteger(String s , int sign , long number , int i){
        if(i >= s.length() || !Character.isDigit(s.charAt(i))){
            return (int)number * sign;
        }

        number = number * 10 + (s.charAt(i) - '0');
        if(number*sign > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(number*sign < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return recStringToInteger(s,sign,number,i+1);
    }
}
