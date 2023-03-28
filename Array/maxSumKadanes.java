package Array;

public class maxSumKadanes {
    public static void kadanes(int arr []){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
         
        for (int i=0; i<arr.length; i++){
            currSum += arr[i];
            if (currSum<0){
                currSum =0;
            } 
            if (maxSum<currSum){
                maxSum= currSum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main (String [] args){
        int arr [] = {-2,-1,-4,5,-3};
        kadanes(arr);
    }   
}
