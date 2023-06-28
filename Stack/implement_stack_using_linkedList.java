package Stack;

public class implement_stack_using_linkedList {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        static Node tail = null;

        // Crating isEmpty() Function With LinkedList
        public boolean isEmpty(){
            return head== null;
        }

        // Creating push() Function with LinkedList
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head= newNode;
                return ;
            }
            newNode.next= head;
            head= newNode;
        }
        
        // Creating pop() Function With LinkedList
        public int pop(){
    
            if(isEmpty()){
                return -1;
            }
           
            int top = head.data;
            head = head.next;
            return top;
        }

        // Creating peek() Funtion with LinkedList
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            return top;
            // return head.data;
        }

    }
    public static void main (String args []){
        Stack s= new Stack();
        s.push(2);
        s.push(1);
        s.push(3);
      // s.pop();
      System.out.print("null");
        while(!s.isEmpty()){
            System.out.print("<-"+s.peek());
            s.pop();
        }
        //System.out.println(s.peek());
        System.out.println("\n"+s.isEmpty());

    }
}
