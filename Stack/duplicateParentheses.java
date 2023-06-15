package Stack;
import java.util.*;

public class duplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            
            if(curr == ')'){
                int count =0;
                if(s.isEmpty()){
                    return true;
                }
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                s.pop();
            }
            else{
                s.push(curr);
            }
            
        }
        if(s.isEmpty()){
            return false;
        }else{
            return true;
        }

    }
    public static void main (String args []){
        String str = "(((a+b)+c)*d)";
        boolean result = isDuplicate(str);
        if(result == true){
            System.out.println("Duplicate Exists");
        }else{
            System.out.println("Duplicate not Exist");
        }
    }
}
