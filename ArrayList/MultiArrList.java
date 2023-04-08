package ArrayList;
import java.util.ArrayList;

public class MultiArrList {
    public static void main (String args [] ){
        ArrayList<ArrayList<Integer>> MainList = new ArrayList <>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list.add(i*1);
            list1.add(i*2);
            list2.add(i*3);
        }
        MainList.add(list);
        MainList.add(list1);
        MainList.add(list2);
        list1.remove(3);
        list1.remove(2);
        //System.out.println(MainList);

        for(int i=0; i<MainList.size(); i++){
            ArrayList<Integer> currList = MainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

    }
}
