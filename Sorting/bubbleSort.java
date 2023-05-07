package Sorting;

public class bubbleSort {
    public static void bubble(int arr []){
        int count =0;
        for (int i=0; i<arr.length-1; i++){   
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = temp;

                    count++;
                }
            }

            // for (int i=0; i<arr.length; i++){
            //     for(int j=i+1; j<arr.length; j++){
            //         if(arr[i]< arr[j]){
            //             int temp = arr[i];
            //             arr[i] = arr[j];
            //             arr[j] =  temp;
            //             count++;
            //         }
            //     }
            
            
        }
        System.out.println("Count of Running Code is:"+count);
    }
    public static void printArr(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main (String [] args){
        int arr [] = {5,4,1,2,3};
        bubble(arr);
        printArr(arr);
    }
}
