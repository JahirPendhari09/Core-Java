

public class matrix {
   public static void main (String args []){
     
    int arr [] [] = {{1,2,3,10},
                     {4,5,6,12},
                     {7,8,9,17}};
     int key = 9;
     int m = 4;

     for(int i= 0 ; i<arr.length ; i++){
        for(int j=0; j<m ; j++){
            System.out.print(arr[i][j]+" ");
            
        }
        System.out.println();
     }
     for(int i= 0 ; i<arr.length ; i++){
        for(int j=0; j<m ; j++){
            if(arr[i][j] == key){
                System.out.println("key found at :"+ "("+i+","+j+")");
            }
            
        }
     }
     
   }   
}
