package Oops;

public class HierarchialInheritance {
    public static void main(String args []){
        Bird peacock = new Bird();
        peacock.eats();
        peacock.breath();

        Mammal cat = new Mammal();
        cat.eats();
        cat.breath();

       FishX shark = new FishX ();
        shark.breath();
        shark.swim();

        
    }
}

class AnimalV{
    void eats(){
        System.out.println("Eating");
    }
    void breath(){
        System.out.println("Breathing");
    }
}

class FishX extends AnimalV{
    void swim(){
        System.out.println("Swimming");
    }
}

class Bird extends AnimalV {
    void fly (){
        System.out.println("Flying");
    }
}
class Mammal extends AnimalV {
    void walk (){
        System.out.println("Walking");
    }

}