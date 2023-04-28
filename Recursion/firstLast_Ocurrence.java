package Recursion;

public class firstLast_Ocurrence {
    // Program for First Ocurrence
    public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i+1);

    }

    // Program for last Ocurrence
    public static int lastOcc(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i-1);

    }
    public static void main (String aargs []){
        int arr []= {4,4,4,4};
        System.out.println(firstOcc(arr, 4, 0));
        System.out.println(lastOcc(arr, 4, arr.length-1));

    }
}
