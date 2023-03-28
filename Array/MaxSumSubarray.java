package Array;

public class MaxSumSubarray {
    public static void maxSum(int arr []){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum =sum + arr[k];
                    if(max<sum){
                        max=sum;      
                    } 
                    if(min>sum){
                        min=sum;
                    }       
                } 
                //System.out.println("Sum of SubArray is :"+sum);                  
            }
        }
        System.out.println("Maximum Sum is :"+max);
        System.out.println("Minimum Sum is :"+min);
    }
    public static void main (String [] args){
        int arr [] = {1,-2,6,2};
        maxSum(arr);
    }
}
