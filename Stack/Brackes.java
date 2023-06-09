package Stack;
import java.util.*;
public class Brackes {
    public static boolean bracketCheck(String arr ){
        Stack<Character> c = new Stack<>();
        for(int i= 0; i<arr.length(); i++){
            char curr= arr.charAt(i);
            if(curr =='(' || curr == '{' || curr == '['){
                c.push(curr);
            }else{
                if(c.isEmpty()){
                    return false;
                }
                if( curr == ']' && c.peek()=='[' || curr == ')' && c.peek()=='(' || curr == '}' && c.peek()=='{' ){
                    c.pop();
                }
                else{
                    return false;
                }
            }  
        }
        if(c.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main (String args []){
        String  arr = "({[]]})";
        
      //  boolean bracketCheck = false;
        boolean bracket = bracketCheck(arr);
        if(bracket== true){
            System.out.println("the arr of bracket is correct");
        }else{
            System.out.println(" the arr of bracket is not correct");
        }
    }
}
