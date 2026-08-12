class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Puppy extends Dog{
    void Weep() {
        System.out.println("Puppy is Weeping");
    }
}
public class MultilevelInheritance {
    public static void main (String[] agrs) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.Weep();
    }
}        

