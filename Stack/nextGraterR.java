package Stack;
import java.util.*;
public class nextGraterR {
    public static void graterRight(int arr [], int rightMax []){
        Stack<Integer> s= new Stack<>();
        for(int i= arr.length-1; i>=0; i--){
            int curr = arr[i];
            while(!s.isEmpty() && curr>arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                rightMax[i]= -1;
            }else{
                rightMax[i]= arr[s.peek()];
            }
            s.push(i);
        }


    }
    public static void main (String args []){
        int arr [] = {6,8,0,1,3};
        int rightMax [] = new int[arr.length];
        graterRight(arr,rightMax);
        for(int i=0; i<rightMax.length ; i++){
            System.out.print(rightMax[i]+" ");
        }
    }
}
