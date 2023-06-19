package Stack;
import java.util.*;
public class maxAreaHistogram { 
    public static  void leftS(int arr[], int leftSmall [], Stack<Integer> s){

       
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];

            while(!s.isEmpty() && curr <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                //System.out.print(-1+" ");
                leftSmall[i]= -1;

            }else{
                //System.out.print(s.peek()+" ");
                leftSmall[i]= s.peek();
            }
            s.push(i);
        }
       

    }
    public static  void rightS(int arr[], int rightSmall [],Stack<Integer> c){
        for(int i= arr.length-1; i>=0; i--){
            int curr = arr[i];
            while(!c.isEmpty() && curr<arr[c.peek()]){
                c.pop();
            }
            if(c.isEmpty()){
                rightSmall[i]= arr.length;
            }else{
                rightSmall[i]= c.peek();
            }
            c.push(i);
        }
    }
    public static void main (String args []){
        int arr [] = {2,1,5,6,2,3};
        Stack<Integer> s = new Stack<>();
        Stack<Integer> c = new Stack<>();
        int leftSmall [] = new int [arr.length];
        int rightSmall [] = new int [arr.length];
        leftS(arr,leftSmall,s);
        for(int i=0; i<leftSmall.length; i++){
            System.out.print(leftSmall[i]+" ");
        }
        System.out.println();
        rightS(arr, rightSmall, c);
        for(int i=0; i<rightSmall.length; i++){
            System.out.print(rightSmall[i]+" ");
        }
    }
}
