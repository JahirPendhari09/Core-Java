package Oops;

public class TypeConstructor {
    public static void main (String args []){
        StudentR a1 = new StudentR();
        a1.name= "jahir pendhari";
        a1.roll = 234;
        a1.password = "abcd";
        a1. Marks[0]=98;
        a1.Marks[1]= 84;
        a1.Marks[2]= 88;

        // for(int i=0; i<3; i++){
        //     System.out.println(a1.Marks[i]);
        // }
        
        StudentR a2 = new StudentR (a1);
        a2.password="XYZ";
        a1.Marks[2]=100;
        for(int i=0; i<3; i++){
            System.out.println(a2.Marks[i]);
        }
        System.out.println(a2.password);
        
        
    }
}

class StudentR{
    String name;
    int roll;
    String password;
    int Marks [];


   // shallow Copy Constructor
    // StudentR(StudentR a1){
    //      Marks =new int [3];
    //     this.name = a1.name;
    //     this.password = a1.password;
    //     this.roll = a1.roll;
    //     this.Marks= a1.Marks;
    // }

  // Deep copy Constructors
    StudentR(StudentR a1){
        Marks =new int [3];
       this.name = a1.name;
       this.password = a1.password;
       this.roll = a1.roll;
       for(int i=0; i<Marks.length; i++){
        this.Marks[i] = a1.Marks[i];
       }
   }
    StudentR(){
        Marks =new int [3];
      //  System.out.println("This is me");
    }
}
