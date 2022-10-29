package cw1;

public class Factorial {
    public static void main(String[] args) {
        int factArg = 5;
        int result = factorial(factArg);
        System.out.println("Silnia z " + factArg + " to "+ result);
    }

    private static int factorial(int n) {
     /*   if (n>1) {
           return n * factorial(n-1);
        } else {
           return n = 1;
        }*/

        return n>1 ? n * factorial(n-1) : 1;

    }

}

