package String;
import java.util.Scanner;

public class vowelSearch {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        System.out.println("count of vowels:"+count);

        String strr= "jahir";
        System.out.println(strr.toUpperCase());
        System.out.println(strr.toLowerCase());
    }
}
