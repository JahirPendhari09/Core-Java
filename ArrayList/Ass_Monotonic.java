package ArrayList;
import java.util.ArrayList;
public class Ass_Monotonic {
    public static boolean monotonic (ArrayList<Integer> list){
        boolean increase = true;
        boolean decrease = true;

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)<list.get(i+1)){
                decrease =false;
            }
            if(list.get(i)>list.get(i+1)){
                increase= false;
            }
        }
        return increase || decrease ;

    }
    public static void main (String args []){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        System.out.println(monotonic(list));
    }
}
