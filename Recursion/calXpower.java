package Recursion;

// finding x power 
public class calXpower {

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int Xm1 = power(x,n-1);
        int Xp =  x* Xm1;
        return Xp;
    }
    public static int optimizedPow(int a,int n){
        if(n==0){
            return 1;
        }
        // int halfPowSq = optimizedPow(a,n/2)* optimizedPow(a,n/2);
    
        int halfPow = optimizedPow(a,n/2);
        int halfPowSq = halfPow * halfPow ;
    
            // when n is odd
        if(n%2 != 0){
            halfPowSq = a* halfPowSq;
        }
        return halfPowSq ;
    }
    public static void main (String args []){
        int x=2;
        //  System.out.println(power(x,10));
        System.out.println(optimizedPow(x,10));
    }
    
}
