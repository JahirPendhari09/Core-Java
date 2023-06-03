package Oops;

public class HybridInheritance {
    public static void main (String args []){
        Dog ce = new Dog ();
        ce.eat();

        peacock le = new peacock();
        le.fly();

        Shark c1 = new Shark ();
        c1.breath();
    }
}

class Animal1{
    void eat(){
        System.out.println("Eating");
    }
    void breath(){
        System.out.println("Breathing");
    }
}

class FishR extends Animal1{
    void swim(){
        System.out.println("Swimming");
    }
}
class BirdR extends Animal1{
    void fly (){
        System.out.println("Flying ");
    }
}
class Human extends Animal1{
    void walk(){
        System.out.println("Walking");
    }
}
class Shark extends FishR{
    int fins;
}
class peacock extends BirdR{
    int legss;
}
class Dog extends Human{
    int hands;
}
