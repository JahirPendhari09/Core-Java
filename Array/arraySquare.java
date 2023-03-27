 package Array;
import java.util.*;
public class arraySquare {
    public static void printSquareSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]* arr[i];
        }
        // Sort using Inbuilt Function 
        Arrays.sort(arr);
        // Printing Array 
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main (String args  []){
        int arr [] = {-4,-1,0,3,10};
        printSquareSort(arr);
    }
}
