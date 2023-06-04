package Oops;

public class Overloading {
    public static void main (String args []){
        Calculator cals = new Calculator ();

        System.out.println(cals.sum(4,5));
        System.out.println(cals.sum(4.4f,5.5f));
        System.out.println(cals.sum(4,5,7));
    }
}
class Calculator{
    int sum(int a,int b){
        return a*b;
    }
    float sum(float a, float b){
        return a*b;
    }
    int sum(int a, int b, int c){
        return a*b-c;
    }
}
