package Array;

public class trappedRainWater {
    public static int trappedWater(int arr []){
        int n = arr.length;
        int depth = 2;
        int leftMax []=  new int [arr.length];
        int rightMax []= new int [arr.length]; 
        
        // calculate left Maximum
        leftMax[0] = arr[0];
        for ( int i=1; i<n; i++){
            leftMax[i]= Math.max(arr[i],leftMax[i-1]);
        }

        // calculate Right Maximum
        rightMax [n-1] = arr[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax [i]= Math.max(arr[i], rightMax[i+1]);
        }
         
        // Assuming Trapped water = 0;
        int trappedWater = 0;

        // loop to calling height of the bar
        for(int i=0; i<n; i++){
            // waterlevel = min(leftMax, rightMax);
            int Waterlevel= Math.min(leftMax[i], rightMax[i]);

            // Trapped water = (waterlevel - arr[i]*depth)
            trappedWater = (trappedWater + (Waterlevel - arr[i]) * depth) ;
        }
        return trappedWater;
    }
    public static void main (String [] args){
        int arr [] = {1,2,4,2,0,3};
        System.out.println(trappedWater(arr));
    }
}
