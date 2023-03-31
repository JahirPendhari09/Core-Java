package Patterns;

public class floyds_Triangle {
    public static void floyd_triangle(int n){
        // outer loop
        int c = 1;
        for(int i=1; i<=n; i++){
            // inner - how many times will c printed
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        floyd_triangle(5);

    }
}
