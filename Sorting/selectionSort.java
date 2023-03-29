package Sorting;

public class selectionSort {
    public static void selection(int arr []){
        int count =0;
        for(int i=0; i<arr.length-1; i++){
            int minPos= i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] >arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
            count++;
        }
        System.out.println("Count of Running Code is :"+count );
    }
    public static void printArr(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args []){
        int arr [] = {5,3,2,1,4};
        selection(arr);
        printArr(arr);
    }
}
