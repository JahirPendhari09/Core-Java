package Array;

public class binarySearch {
    public static int index(int arr[], int key){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            // compare
            if(key==arr[mid]){
                return mid;
            }
            if(key>arr[mid]){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int key = 8;
        System.out.println(" key is at index:"+ index(arr,key));
    }
}


