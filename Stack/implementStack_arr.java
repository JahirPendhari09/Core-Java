package Stack;
import java.util.*;

public class implementStack_arr {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // Creating isEmpty() Function
        public  boolean isEmpty(){
            return list.size()==0;
        }

        // Creating Push() Function
        public  void push(int data){
            list.add(data);
        }

        // Creating pop() Function
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // Creating peek() Function 
        public int peek(){
            return list.get(list.size()-1);
        }

    }
    public static void main (String args []){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.isEmpty();
        System.out.println(s.isEmpty());
       // s.pop();
        System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
}
