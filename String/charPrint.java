package String;

public class charPrint {
    public static void printChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main (String args []){
        String str = "jahir pendhari";
        printChar(str);
    }
}
