package Recursion;

// number to String convertor
public class number_to_String {

    static String digit [] = {"zero","one","two","three","four","five", "six","seven","eight","nine"};
    
    public static void printDigit(int number){
        if(number == 0){
            return  ;
        }
        int lastdigit = number %10;
        printDigit(number/10);
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main (String args []){
        printDigit(1995);

    }
}

