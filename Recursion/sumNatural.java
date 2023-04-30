package Recursion;

public class sumNatural {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sumNm1 = sum(n-1);
        int sumN = n+ sumNm1 ;
        return sumN ;
    }
    public static void main (String args []){
        int n=5;
        System.out.println(sum(n));
    }
}
