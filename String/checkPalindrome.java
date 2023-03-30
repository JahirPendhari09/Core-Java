package String;

public class checkPalindrome {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main (String args []){
      String str = "madam";
      boolean  e = isPalindrome(str);
      
      if(e==true){
        System.out.println("This string is Palindrome");
      }
      else{
        System.out.println("This String is not Palindrome");
      }
    }
}
