package Backtracking;

public class MoblieKeyB {
    final static char [][] L={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    
    public static void letterCombination(String s){
        int len = s.length();
        if(len == 0){
            System.out.println("");
            return;
        }
        bfs(0, len,new StringBuilder(), s);
       
    }
    public static void  bfs(int pos, int len, StringBuilder sb, String s){
        if(pos ==len){
            System.out.print(sb.toString()+" ");
        }else{
            char [] Letter =L[Character.getNumericValue(s.charAt(pos))];
            for(int i=0; i<Letter.length; i++){
                bfs(pos+1, len, new StringBuilder(sb).append(Letter[i]),s);
            } 
        }
    }
    public static void main (String args []){
        letterCombination("8");
        // Output is = t u v
    }
}
