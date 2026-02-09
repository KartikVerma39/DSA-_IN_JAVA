//Task 1. Create a class MathUtility with the following methods:
//* add(int a, int b) → returns sum
//* subtract(int a, int b) → returns difference
//* multiply(int a, int b) → returns product
//* divide(int a, int b) → returns quotient



public class MathUtility {

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int divide(int a , int b){
        return a / b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    public static void main(String[] args){
        MathUtility math = new MathUtility();

        System.out.println(math.add(4,5));
        System.out.println(math.subtract(9,5));
        System.out.println(math.divide(10,5));
        System.out.println(math.multiply(5,6));
    }
}
