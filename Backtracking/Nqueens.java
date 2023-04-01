package Backtracking;

public class Nqueens {
    public static boolean isSafe(char curr[][], int row, int colm){
        // for vertical up
        for(int i=row-1; i>=0; i--){
            if(curr[i][colm]=='Q'){
                return false;
            }
        }

        // for Diagonaly left up 
        for(int i=row-1,j=colm-1; i>=0 && j>=0; i--,j--){
            if(curr[i][j]=='Q'){
                return false;
            }
        }

        // for Diagonaly right up 
        for(int i=row-1,j=colm+1; i>=0 && j<curr.length; i--,j++){
            if(curr[i][j]=='Q'){
                return false;
            }
        }

        return true;       
    }
    public static void board(char curr [][],int row){
        if(row==curr.length){
            printle(curr);
           count++;
            return ;
        }
        for(int j=0; j<curr.length; j++){
            if(isSafe(curr,row,j)){
                curr[row] [j]='Q';
                board(curr, row+1); 
                curr[row][j]='X';
            }       
        }
    }

    static int count =0;
    public static void printle(char curr [][]){
        System.out.println("---------Chess Board-------");
        for(int i=0; i<curr.length; i++){
            for(int j=0; j<curr.length; j++ ){
                System.out.print(curr[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static void main (String args []){
        int n=4;
        char curr [][]= new char [n][n];
        for(int i=0; i<curr.length; i++){
            for(int j=0; j<curr.length; j++){
                curr[i][j] = 'X';
            }
        }
        board(curr, 0);
        System.out.println("No of ways to set Queen on table "+count);
    }
}
