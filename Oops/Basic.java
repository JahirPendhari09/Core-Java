package Oops;

public class Basic {
    public static void main (String args []){
        Pen p1 = new Pen ();  // Created a pen object callead p1 and Pen is a constructor
        p1.colour = "blue";
        p1.Tips = 6;
        p1.settip(6);  
        System.out.println(p1.colour);
        System.out.println(p1.Tips);
        p1.setColour("Yallow");
        p1.setColour("Pink");
        System.out.println(p1.colour);

        Student s1 = new Student();
        s1.setPercentage(97,67,87);
        System.out.println(s1.Percentage);
        Student s2 = new Student();
        s2.Name = "Jahir Pendhari ";
        s2.Age = 24;
        System.out.println(s2.Name);
        System.out.println(s2.Age);

        BankAccount myAcc = new BankAccount ();
        myAcc.username = "Jahir pendhari";
        System.out.println(myAcc.username);
        //myAcc.password = "abcd";
        // that statement password not visible and Error can Occuipy
        myAcc.setpassword("abcd");
        System.out.println(myAcc.getpassword());
        

    }
    
}
class Pen {
    String colour;
    int Tips;

    void setColour(String newCol){
        colour = newCol;
    }
    void settip(int tip){
        Tips = tip;
    }
}

class Student {
    String Name;
    int Age;
    float Percentage;

    void setPercentage(int phy,int che,int math){
        Percentage = (phy + math + che)/3;
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setpassword(String pw){
        this.password = pw;
        // password = pw;       both are valid
    }
    public String getpassword(){ 
        // return type must important while getpassword otherwise syntax error occuipies
        
       // return this.password; both are valid 
        return password;
    }


}