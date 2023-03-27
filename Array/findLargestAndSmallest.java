package Array;

public class findLargestAndSmallest {
    public static int getSmallest(int numbers[]){
        int isLargest = Integer.MIN_VALUE;
        int isSmallest= Integer.MAX_VALUE;

        for (int i= 0; i<numbers.length; i++){
            if (isLargest<numbers[i]){
                isLargest=numbers[i];
            }
            if (isSmallest>numbers[i]){
                isSmallest= numbers[i];
            }
        }
        System.out.println("largest number is:"+ isLargest );
        return isSmallest;
    }
    public static void main (String []args){
        int [] numbers= {1,2,3,7,9,6,5,4};
        System.out.println("Smallet number is :"+getSmallest(numbers));
         
    }
}
