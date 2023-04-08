package ArrayList;
import java.util.ArrayList;
public class TwoPointer {
    public static boolean pairSum(ArrayList<Integer> list , int target){

        int si =0;
        int ei =0;   
        int n=list.size();
        for(int k=0; k<n; k++){
            if(list.get(k)>list.get(k+1)){
                si=k+1;
                ei=k;
                break;
            }
        }
        
        while(si!=ei){
            if(list.get(si)+list.get(ei)==target){
                System.out.println("("+si+","+ei+")");
                return true;
            }
            else if(list.get(si)+list.get(ei)<target){
                si= (si+1)%n;
            }else{
                ei=(n+ei-1)%n;
            }
        }
        return false;
    }
    public static void main (String args []){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 16));
    }
}
