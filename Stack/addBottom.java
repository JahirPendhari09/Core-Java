package stackDataType;
import java.util.*;

public class addBottom {
    public static void addBottomStack(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        addBottomStack(s, data);
        s.push(top);

    }
    // public static void addMiddle(Stack<Integer> s, int data){
    //     if(s.size()==1){
    //         s.push(data);
    //         return;
    //     }
    //     int top= s.pop();
    //     addMiddle(s, data);
    //     s.push(top);
    // }
    public static void main (String args []){
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        addBottomStack(s,4);
       // addMiddle(s, 8);
        while(!s.isEmpty()){
           // System.out.println(s.pop());
           System.out.print(s.peek()+" ");
           s.pop();
        }
    }
}
