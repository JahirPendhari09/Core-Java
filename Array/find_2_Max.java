package Array;

public class find_2_Max {
    public static void main(String args []){
        int arr [] = {7,704,87,54};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                secMax = max;
                max = arr[i];
            }
            else if(secMax<arr[i]){
                secMax = arr[i];
            }
        }
        System.out.println("Maximum is :"+max);
        System.out.println("2 Maximum is :"+secMax);
    }
}
