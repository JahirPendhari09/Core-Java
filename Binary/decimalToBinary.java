package Binary;

public class decimalToBinary {
  public static void decimalTBinary(int n){
    int myNum =  n;
    int deci = 0;
    int pow = 0;
    while (n>0){
        int rem = n%2;
        deci = deci+ ( rem*(int)Math.pow(10, pow));
        pow++;
        n= n/2;
    }
    System.out.println(" Binary of Decimal is"+myNum+"="+deci);

  }
  public static void main (String []args){
      decimalTBinary(7);
      // output is 111
  }  
}
