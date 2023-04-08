package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class Swap {
    public static void swap (ArrayList<Integer> Classroom,int idx1, int idx2){
        int temp = Classroom.get(idx1);
        Classroom.set(idx1, Classroom.get(idx2));
        Classroom.set(idx2, temp);
    }
    public static void main (String args []){
        ArrayList<Integer> Classroom = new ArrayList<>();
        Classroom.add(2);
        Classroom.add(5);
        Classroom.add(9);
        Classroom.add(3);
        Classroom.add(7);

        int idx1 = 1;
        int idx2 = 3;

        System.out.println("Before Swapping the element"+Classroom);

        swap(Classroom,idx1,idx2);
        
        System.out.println("After Swapping the element"+Classroom);

        // Collections.sort(Classroom);
        // System.out.println("Sorting Ascending Order"+Classroom);

        // Collections.sort(Classroom,Collections.reverseOrder());
        // System.out.println("Sorting Decending Order"+Classroom);
    }
}
