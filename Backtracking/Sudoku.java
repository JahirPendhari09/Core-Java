package BackTracking;

public class Sudoku {
   
    public static boolean isSafe(int sudoku [][], int row,int col, int digit){
        // for row 
        for(int i=0; i<sudoku.length; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        // for col
        for(int j=0; j<sudoku[0].length; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        // for grid 
        int StartRow = (row/3)*3;
        int StartCol = (col/3)*3;
        for(int i=StartRow; i<StartRow +3;i++){
            for(int j=StartCol; j<StartCol+3; j++){
                if(sudoku [i][j]== digit){
                    return false;
                }
            }
        }
        return true;
    }
   
    public static boolean sudokuSolver(int sudoku [][],int row,int col){
        if(row ==sudoku.length ){
            return true;
        }
        int newRow = row;
        int newCol = col+1;
        if(newCol==sudoku[0].length){
            newRow=row+1;
            newCol = 0;
        }
        if(sudoku[row][col]!=0){
           return sudokuSolver(sudoku, newRow, newCol);
        }
        else{
            for(int digit=1; digit<=9; digit++){
                if(isSafe(sudoku,row,col,digit)){
                 sudoku[row][col]=digit;     // place digit at row and col 
                  if(sudokuSolver(sudoku,newRow,newCol)){   // call  recursion n-1  call  
                     return true;
                   }
                   sudoku[row][col]=0; // backracking when wrong digit placed then delete that digit and replace 0;
                }
            }
        }
       
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<sudoku.length; i++){
            for(int j=0; j<sudoku[0].length; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String args []){
        int sudoku [][] = {{2,0,8,0,0,0,0,0,5},
                           {4,9,0,1,5,7,0,0,2},
                           {0,0,3,0,0,4,1,9,0},
                           {1,8,5,0,6,0,0,2,0},
                           {0,0,0,0,2,0,0,6,0},
                           {9,6,0,4,0,5,3,0,0},
                           {0,3,0,0,7,2,0,0,4},
                           {0,4,9,0,3,0,0,5,7},
                           {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution is exist");
            System.out.println();
            printSudoku(sudoku);
        }else{
            System.out.println("Solution does not exist");
        }                   
    }
}
