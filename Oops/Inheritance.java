package Oops;

public class Inheritance {
    public static void main (String args []){
        Fish shark = new Fish();
        shark.eat();
        shark.Colour = "purple";
        shark.fins = 16;
        System.out.println(shark.Colour);
        System.out.println(shark.fins);
        shark.swim();
    }
    
}
class Animal {
    String Colour;

    void eat(){
        System.out.println("Eating");
    }
    void Breath (){
        System.out.println("Breathing ");
    }
}
class Fish extends Animal {
    int fins;
    
    void swim (){
        System.out.println("Swimming");
    }
}
