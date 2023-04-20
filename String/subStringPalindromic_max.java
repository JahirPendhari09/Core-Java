package String;

public class subStringPalindromic_max {
    public static void main (String args []){
        String str ="mhfkmoomhsh";

        // palindromic substring is : moom 
        // ans : 4

        int max_Palindromic_String = Integer.MIN_VALUE;
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){

                String ans ="";
                for(int k=i; k<=j; k++){
                    ans +=str.charAt(k);
                }

                int count =0;

                int n= ans.length();

                for(int k=0; k<n/2; k++){
                    if(ans.charAt(k) != ans.charAt(n-1-k)){
                        count++;
                    }
                }

                if(count ==0){
                    max_Palindromic_String = Math.max(max_Palindromic_String,n);
                }
            }
        }


        System.out.println("maximum length of subString Palindrome :"+max_Palindromic_String);
    }
}
