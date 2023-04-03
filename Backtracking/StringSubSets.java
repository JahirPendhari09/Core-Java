package Backtracking;

public class StringSubSets {
    public static void findSubsets(String str, String ans, int i){

        // Base Case 
        if(i==str.length()){
            if(ans.length()<=0){
                System.out.println("null");
            }else{
                System.out.print(ans);
            }
            return;
        }
        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
    }
    public static void main (String arg [] ){
        String str = "abc";
        // output = abc,ad,ac,a,bc,b,c 
        findSubsets(str," ",0);
    }
}
