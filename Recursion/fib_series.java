package Recursion;

public class fib_series {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int Fibnm1 = fib(n-1);
        int Fibnm2 = fib(n-2);
        int FibN   = Fibnm1 + Fibnm2;
        return FibN;
    }
    public static void main (String args []){
        int n=5;
        System.out.println(fib(n));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(10));
    } 
}
