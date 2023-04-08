package ArrayList;
import java.util.ArrayList;
public class containerMostWater {
    public static int storeWater(ArrayList<Integer> height){
      // Brute Force Method  Time complexity is O(n2)
        
        int maxWater = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht= Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
 
    }
    public static void main (String args []){
        ArrayList<Integer> Classroom = new ArrayList<>();
        Classroom.add(1);
        Classroom.add(8);
        Classroom.add(6);
        Classroom.add(2);
        Classroom.add(5);
        Classroom.add(4);
        Classroom.add(8);
        Classroom.add(3);
        Classroom.add(7);

        System.out.println(storeWater(Classroom));
    }
}
