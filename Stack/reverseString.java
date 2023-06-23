package Stack;
import java.util.*;
public class reverseString {
    public static void  reverse(String str ){
        Stack<Character> r= new Stack<>();
        
        int idx=0;
        StringBuilder sb = new StringBuilder("");
        while(idx<str.length()){
            r.push(str.charAt(idx));
            idx++;
        }

        while(!r.isEmpty()){
            sb.append(r.peek());
            r.pop();
        }

         System.out.println(sb.toString());

    }
    public static void main(String args[]){
        //String e= "abc";
        String e= "Hello World";
       // String r = "abc";
       reverse(e);
    }
}
