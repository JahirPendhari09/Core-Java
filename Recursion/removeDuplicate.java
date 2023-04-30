package Recursion;

public class removeDuplicate {
    public static void duplicateD(String str,int idx,  StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr-'a']== true){
            duplicateD(str, idx+1, newStr, map);
        }
        else{
            map[curr-'a']= true;
            duplicateD(str, idx+1, newStr.append(curr), map);
        }
    }
    public static void remove (String str,int idx,boolean map[],StringBuilder newStr){
     //   StringBuilder newStr = new StringBuilder("");
       // int idx = 0;
       // boolean map [] = new boolean [26];
        if(idx==str.length()){
            System.out.println(newStr);
           // System.out.println(map[idx]);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            remove(str,idx+1,map,newStr);  
        }
        else{
            map[currChar - 'a']= true;
            remove(str,idx+1,map,newStr.append(currChar));
            //newStr.append(currChar);
        }
    }
    public static void main (String args []){
        String str = "appnnacollege";
        duplicateD(str, 0, new StringBuilder(""), new boolean [26]);

        remove("moonsoon",0,new boolean [26],new StringBuilder(""));
    }
}
