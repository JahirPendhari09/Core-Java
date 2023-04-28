package Recursion;

public class friendsPair {
    public static int calPairs(int n){
        if(n==1||n==2){
            return n;
        }
        return calPairs(n-1)+ (n-1)*calPairs(n-2);

        
    //     // there are 2 choices single and pair
    //     // for single
    //    int single = calPairs(n-1);
    //     // for Pairs
    //     int pairs = (n-1)* calPairs(n-2);
    //     return single + pairs;

    }
    public static void main (String args []){
        int n=5;
        System.out.println("Number of Pairs formed:"+calPairs(n));
    }
}
