package String;

public class reverseString {
    public static void main (String args []){
        StringBuilder sb = new StringBuilder("Jahir Pendhari");

        for(int i=0; i<sb.length()/2; i++){

            int front =i;
            int last = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char lastChar  = sb.charAt(last);

             sb.setCharAt(front, lastChar);
             sb.setCharAt(last, frontChar);

            // inbuilt function 
            //sb.reverse();
           
        }
        System.out.println(sb);
       // System.out.println(4%6);
       
    }
}
