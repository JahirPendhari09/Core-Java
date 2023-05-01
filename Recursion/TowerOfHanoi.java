package Recursion;

public class TowerOfHanoi {
    public static void moveAll(int n, String source,String Destination,String helper){
        if(n==1){
            System.out.println("move disk "+n+" from "+source+" to "+Destination+" ");
            return ;
        }
        moveAll(n-1,source,helper,Destination );
        System.out.println("move disk "+n+" from "+source+" to "+Destination+" ");
        moveAll(n-1,helper, Destination,source);
    }
    public static void main (String args []){
        int n=3;
        moveAll(n,"S","h","D");
    }
}
