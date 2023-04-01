package Backtracking;

public class GridWays {
    public static int gridWays(int i,int j,int n,int m){
        // Base case 
        if(i==n-1 || j==m-1){   // condition for last cell  
            return 1;
        }else if(i==n || j==m){  // Boundary cross condition
            return 0;
        }
        // recursion
        // only Right and Down  Allowed 
       int way1 = gridWays(i,j+1,n,m);
       int way2 = gridWays(i+1,j,n,m);
       int totalWays= way1+ way2;
       return totalWays ;
    }
    public static void main (String args []){
        int n=3,m=3;
        System.out.println(gridWays(0, 0,n,m));
    }
}
