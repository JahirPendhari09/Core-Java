package QueueDataType;


public class circularQueueArray {
    static class Queue{
        static int arr [];
        static int size;
        static int rear; 
        static int front;

        Queue(int data){
            arr = new int[data];
            size = data;
            rear = -1;
            front = -1;
        }

        // creating isEmpty function
        public static boolean isEmpty(){
            return rear ==-1 && front == -1;
        }

        // creating isFull function
        public static boolean isFull(){
            return (rear+1)% size == front;
        }

        // creating add function
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full" );
                return ;
            }

            rear = (rear+1)%size;
            if(front == -1){
                front = 0;
            }
            arr[rear] = data;
        }

        // creating remove function 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            if(rear == front ){
                rear = front = -1;
            }else{
                front = (front +1)%size;
            }
            return result;
        }

        // creating peek function

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main (String args []){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       // System.out.println(q.peek());
        q.add(5);
        q.remove();
        q.add(6);
        // System.out.println(q.peek());
        q.remove();
        q.add(7);
        
        // System.out.println(q.isEmpty());
        // System.out.println(q.isFull());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
