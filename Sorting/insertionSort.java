package Sorting;

public class insertionSort {
    public static void insertion(int arr []){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
          // finding out the correct to previous
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
           // for insertion 
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr []){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
   public static void main (String [] args) {
      int arr [] = {3,4,1,2,5};
      insertion(arr);
      printArr(arr);
   }  
}
