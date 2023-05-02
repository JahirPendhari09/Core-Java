package Patterns;

public class half_Pyramid {
    public static void invertedHalfPyramid(int n){
        // outer loop 
        for(int i=1; i<=n; i++){
            // inner loop
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
               // System.out.print(" "); for triangle 
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        invertedHalfPyramid(5);
    }
}
