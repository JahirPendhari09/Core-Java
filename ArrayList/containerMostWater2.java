package ArrayList;
import java.util.*;
public class containerMostWater2 {
    public static int storeWater(ArrayList<Integer>Classroom){
        int si =0;
        int ei = Classroom.size()-1;
        int maxWater = Integer.MIN_VALUE;

        while(si!=ei){
            int height = Math.min(Classroom.get(si),Classroom.get(ei));
            int length= ei-si;
            int currWater = height*length;
            maxWater= Math.max(maxWater,currWater);

            if(Classroom.get(si)>Classroom.get(ei)){
                ei--;
            }
            else{
                si++;
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

        System.out.println("Maxwater ="+storeWater(Classroom));
    }
}
