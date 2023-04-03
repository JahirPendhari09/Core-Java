package Backtracking;

public class Permutation {
    public static void findPermutation(String str,String ans){
        // Base case
        if(str.length()==0){
            System.out.println(ans);
        }
        // Recursion 
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // if curr is i=c 
            // abcde = ab + de = abde
            // deleting element i choice i=c
            String newStr = str.substring(0,i)+str.substring(i+1,str.length());
            findPermutation(newStr, ans+curr);
        }
    }
   
    public static void main(String args[]){
        String str = "abc";
        // output = abc,acb,bac,bca,cab,cba
        findPermutation(str, " ");
        
    }
}
