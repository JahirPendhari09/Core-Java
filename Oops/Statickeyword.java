package Oops;
public class Statickeyword {
    public static void main (String args []){
        StudentS s1 = new StudentS();

        s1.schoolName = "SITCOE";
        s1.name = "jahir pendhari";
        System.out.println("College name :"+s1.schoolName);
        System.out.println("Student name :"+s1.name);
        
        System.out.println("Percentage :"+s1.cgpa(56, 85, 85));
        s1.rollNo =501;
        System.out.println("Roll no :"+ s1.rollNo);
        System.out.println();
        
        StudentS s2 = new StudentS();
        s2.schoolName = "AMGOI";
        s2.name = "Shakil Pendhari";
        System.out.println("College name :"+s2.schoolName);
        System.out.println("Student name :"+s2.name);  
        System.out.println("Percentage :"+s2.cgpa(75, 76, 66));
        s2.rollNo =510;
        System.out.println("Roll no :"+s2.rollNo);
        System.out.println();

        StudentS s3 = new StudentS ();
        s3.name = " Sad pendhari";
        s3.schoolName = " Narande HighSchool Narande";
        s3.rollNo =  29;
        System.out.println("SchoolName:"+s3.schoolName);
        System.out.println("Student Name :"+s3.name);
        System.out.println("RollNo:"+s3.rollNo); 
        System.out.println("Percentage :"+s3.cgpa(65, 70, 76));
        System.out.println();

        StudentS s4 = new StudentS ();
        s4.name = " Sakib pendhari";
        s4.schoolName = " Vidya Mandir Golivne Bhendawade ";
        s4.rollNo =  20;
        System.out.println("SchoolName:"+s4.schoolName);
        System.out.println("Student Name :"+s4.name);
        System.out.println("RollNo:"+s4.rollNo); 
        System.out.println("Percentage :"+s4.cgpa(45, 65, 55));
    }
}
class StudentS{
    String name ;
    int rollNo;

    void getName(String name){
        this.name = name;
    } 
    static  String schoolName;
    static float cgpa(float math,float phy,float che){
        return (math+phy+che)/3;
    }
    void getNo(int rollNo){
      this.rollNo = rollNo;
    }
}