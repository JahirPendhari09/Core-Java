package Sorting ;

public class QuickSort {
    public static void printSort(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr [],int si,int ei){
        // Base Case
        if(si>=ei){
            return;
        }
        // Kam 
        int idx =  partition(arr, si,ei);
        // call n-1 
        sort(arr, si,idx-1);
        sort(arr, idx+1,ei);
    }
    public static int partition(int arr [], int si,int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot

        for(int j=si;j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                // swapping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot; //  pivot == arr[ei]
        arr[ei] = arr[i];
        arr[i]  = temp;
        return i;
    }
    public static void main (String args []){
        int arr [] = {5,4,6,1,3,2,-1};
        // Output is = -1,1,2,3,4,5,6
        sort(arr, 0, arr.length-1);
        printSort(arr);
    }
}
