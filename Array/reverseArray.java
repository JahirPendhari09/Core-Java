package Array;

public class reverseArray {
    public static void reverse(int arr[]){
        int L=arr.length;
        int n= Math.floorDiv(L, 2);
        int temp;
        for(int i=0; i<n; i++){
            
            temp = arr[i];
            arr[i]= arr[L-1-i];
            arr[L-1-i] =temp;
        }
    }
    // public static void reverseR(int arr[]){
    //     int start=0;
    //     int end=arr.length-1;
    //     int temp;

    //     while(start < end){
    //         temp= arr[start];
    //         arr[start]= arr[end];
    //         arr[end]= temp;

    //         start++;
    //         end--;
    //     }

    // }
    public static void main(String args []){
        int arr [] ={1,2,4,5,6,7,8,9};
        reverse(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // reverseR(arr);

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
    } 
}
