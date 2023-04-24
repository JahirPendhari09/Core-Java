package Recursion;

public class factorial_Rec {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int factNm1=factorial(n-1);
        int factN = n*factNm1;
        return factN;
    }
    public static void main (String args []){
        int n=5;
        System.out.println(factorial(n));
    }
}
