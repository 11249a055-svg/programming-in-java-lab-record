class Animal1 {
    void eat(){
        System.out.println("Animal1 is eating");
    }
}
class Dog extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
