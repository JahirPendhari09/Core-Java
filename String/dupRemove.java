package String;

public class dupRemove {
    public static void removeDuplicate(String str,int idx,  StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr-'a']== true){
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[curr-'a']= true;
            removeDuplicate(str, idx+1, newStr.append(curr), map);
        }
    }
    public static void main (String args []){
        String str = "iamagoodboy";
        removeDuplicate(str,0,new StringBuilder(""),new boolean [26]);
    }
}
