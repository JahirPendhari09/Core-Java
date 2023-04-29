package Recursion;

public class print_num_Reverse {
    public static void NumDec(int number){
        if(number == 1){ 
            System.out.println(number);
            return ; 
        }
        System.out.print(number+" ");
        NumDec(number-1);
    }
    public static void main (String args []){
        int number =10;
        NumDec(number);
    }
}
