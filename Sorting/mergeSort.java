package Sorting;

public class mergeSort {
    public static void printSort(int arr []){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sortRecursion(int arr [],int si, int ei){
        // Base Case 
        if(si>=ei){
            return ;
        }
        // kam
        // or (si + ei)/2
        int mid = si +(ei - si)/2;

        // for leftpart;
        sortRecursion(arr,si , mid);

        // for rightpart
        sortRecursion(arr,mid+1, ei);

        merge(arr,si,mid,ei);

    }
    public static void merge(int arr [],int si,int mid,int ei){
        // left (0,3)=4 right(4,6) =3 
        int temp [] = new int [ei-si+1];
        int i= si; // iterator for left part
        int j= mid+1; // iterator for right part
        int k=0;    // iterator for temparary arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
            }else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i<= mid){
            temp[k++]= arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for( k=0,i=si; k<temp.length; k++, i++ ){
            arr [i]=temp[k];
        }
    }
    public static void main (String args []){
        int arr [] = {2,4,1,0,6,3};
        // Output is = 0,1,2,3,4,6
        
        sortRecursion(arr, 0, arr.length-1);
        printSort(arr);
    }
}
