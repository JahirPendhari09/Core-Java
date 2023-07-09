package QueueDataType;

public class implement_Queue_using_LinkedList {
   public static class Node{
         int data;
         Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class Queue{

       static Node head = null;
       static Node tail = null;

       public static boolean isEmpty(){
           return head == null && tail == null;
       }

       public static void add(int data){
           Node NewNode = new Node(data);
           if(isEmpty()){
               head = tail= NewNode;
               return ;
           }
           
           tail.next = NewNode;
         //  NewNode.next = null;
           tail = NewNode;
           
       }

       public static int remove(){
           if(isEmpty()){
               System.out.println("Queue is empty");
               return -1;
           }
           int result = head.data;
           // single element 
           if(tail == head){
             head = tail = null;
           }else{
             head = head.next;
           }
          
           return result;
       }

       public static int peek(){
           if(isEmpty()){
               System.out.println("Queue is empty");
               return -1;
           }
           return head.data;
       }
    }
        

    
    public static void main (String args []){
        Queue q = new Queue ();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
       // q.add(5);
        System.out.println(q.isEmpty());


    }
}
