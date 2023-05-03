package AllLinkedList;

public class LinkedList {
    public static class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addF(int data){
        // Step 1 = create new Node
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return ;
        }
       
        // step 2= newNode next = head
        newNode.next= head; // linking statement

        // step 3 = head = newNode
        head = newNode;
        

    }
    public void addL(int data){
        // Step 1 = create new Node
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
       
        // step 2= tail next = newNode
        tail.next= newNode; // linking statement

        // step 3 = tail = newNode
        tail = newNode;

    }
    public void print(){
        // creating temp Node
        Node temp = head;

        if(head == null){
            System.out.println("LL is Empty");
            return ;
        }
       

        // Printing the linkedList
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void addM(int idx,int  data){
        // idx==0 directly call addFirst function
        if(idx ==0){
            addF(data);
            return;
        }
        // create new Node
        Node newNode = new Node(data);
        // create temp newNode to travel upto data
        Node temp =head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i= idx-1; temp-> prev
        newNode.next= temp.next;
        temp.next= newNode;
    }
    // Calculating size of an LinkedList
    public int sizeList(){
        int size=0;
        Node temp= head;
        while(temp !=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public int removeF(){
        if(sizeList()==0){
            System.out.println("ll is Empty");
            return Integer.MAX_VALUE;
        }
        int val = head.data;
        head= head.next;
        return val;
    }
    public int removeL(){
        int size=0;
        if(sizeList()==0){
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        }else if((sizeList()==1)){
            int val =head.data;
            head= tail=null;
             size =0;
            return val;

        }
        // prev : i=size-2;
        Node prev= head;
        for(int i=0; i<sizeList()-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    // key search itrative approach
    public int itSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data ==key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }
    // key Search as using Recursively
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key ){
            return 0;
        }int idx = helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int RecursiveSearch(int key){
        return helper(head,key);
    }
    // Reverse A Linkedlist 
    public void Reverse(){
        Node prev=null;
        Node curr = tail= head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr = next;
        }
        head = prev;
    }
    // Find And Remove Nth Node ofrom End
    public void deletNthFromEnd(int n){
        // Step 1: calculate size
        int size=0;
        Node temp=head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        // when Nth term is fast
        if(n==size){
            head = head.next;
            return ;
        }

        // Calculating size-2
        int i=1;
        int isToFind= size-n;

        Node prev=head;
        while(i<isToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    // Check LinkedList is a palindrome Or not
    // Step 1 : Calculate mid By using Slow and Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast= head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        // int list only 1 element Occurs 
        if(head==null || head.next==null){
            return true;
        }
        // Step 1 : calculate mid 
        Node midNode = findMid(head);

        // Step 2: Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev = curr; 
            curr= next;
        }

        //  Defining Rigth Half Head 
        Node left = head;
        Node right = prev;

        // Step 3: Check lef half vs rigth half

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main (String args []){
        LinkedList ll = new LinkedList();
      //  ll.print();
        ll.addF(1);
      //  ll.print();
        ll.addF(2);
      //  ll.print();
        ll.addL(1);
       // ll.print();
      //  ll.addM(0, 9);
       // ll.addM(2, 8);
        ll.addL(2);
     //   ll.print();
      //  System.out.println(ll.sizeList());
      //  System.out.println(ll.removeF());
        ll.print();
        // ll.removeL();
        // System.out.println(ll.itSearch(10));
        // System.out.println(ll.itSearch(8));
        // System.out.println(ll.RecursiveSearch(10));
        // System.out.println(ll.itSearch(8));
        //ll.print();
       // ll.Reverse();
        ll.deletNthFromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());

        
    }
}
