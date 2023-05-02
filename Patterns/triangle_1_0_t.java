package Patterns;

public class triangle_1_0_t {
    public static void triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int c=i+j;

                if(c%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        triangle(5);
    }
}
