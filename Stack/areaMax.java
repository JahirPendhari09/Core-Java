package Stack;
import java.util.*;

public class areaMax {
    public static  int leftS(int arr[], int leftSmall [],int rightSmall []){
        Stack<Integer> s = new Stack<>();
        //Stack<Integer> c = new Stack<>();
        int maxAreaOfHistogram = Integer.MIN_VALUE;

        // Calculating  next LEft Small values
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
        // Calculating next Right Small Values

        s = new Stack<>(); // to modifing Stack or deleting all the data in stack  
        for(int i= arr.length-1; i>=0; i--){
            int curr = arr[i];
            while(!s.isEmpty() && curr<arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                rightSmall[i]= arr.length;
            }else{
                rightSmall[i]= s.peek();
            }
            s.push(i);
        }

        // Calculating area of Rectangular Histogram
        for(int i=0 ; i<arr.length; i++){
           // int area = arr[i]*(rightSmall[i]-leftSmall[i] -1);
          //  System.out.print(area+" ");
          int height =arr[i];
          int width = rightSmall[i]-leftSmall[i] -1;

          int currArea = height * width;

          // Compairing Area with maximum Histogram Area
            maxAreaOfHistogram = Math.max(maxAreaOfHistogram, currArea);
        }
        return maxAreaOfHistogram;
    }
    public static void main (String args []){
        int arr [] ={2,1,5,6,2,3};
        int leftSmall [] = new int [arr.length];
        int rightSmall [] = new int [arr.length];

       int result = leftS(arr, leftSmall, rightSmall);

       System.out.println("\nThe Maximum Area in Histogram is:"+result);

        // for(int i=0; i<leftSmall.length; i++){
        //     System.out.print(leftSmall[i]+" ");
        // }
        // System.out.println();

        // for(int i=0; i<rightSmall.length; i++){
        //     System.out.print(rightSmall[i]+" ");
        // }

    }
}
