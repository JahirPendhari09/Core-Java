package Recursion;

public class TillingProblem {
    public static int ways(int n){
        if(n==0 ||n==1){
            return 1;
        }
        return ways(n-1)+ ways(n-2);
        // // there are two choices fix tile on floor  vertically or horizontally 

        // // for vertically
        // int vertical = ways(n-1);

        // // for Horizontally
        // int horizontal = ways(n-2);

        // // total ways to set tile on floor
        // int totalWays =vertical + horizontal ;
        // return totalWays ;
    }
    public static void main (String args []){
        int n=5;
        System.out.println(ways(n));

    }
}
