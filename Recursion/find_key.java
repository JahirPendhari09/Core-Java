package Recursion;

public class find_key {
    // checking how much time key input in arr
    
    public static void check(int arr [], int key,int i ){
        if(i==arr.length ){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        check(arr, key, i+1);
    }
    public static void main (String args []){
        int arr [] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        check(arr, key, 0);
    }
}

