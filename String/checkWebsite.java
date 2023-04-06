package String;
import java.util.Scanner;
public class checkWebsite {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last digit of Website :");
        String name = sc.next();
        if(name.endsWith(".com")){
             System.out.println("Commercial Website");
        }
        else if(name.endsWith(".org")){
            System.out.println("Organisational Website");
        }
        else if( name.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Please enter write digit");
        }
    }
}
