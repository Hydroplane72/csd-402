
public class InheritanceExample {

    public static void main(String[] args) {
        // Create an instance of the child class
        Dog myDog = new Dog();

        // 1. Calling an inherited method from the parent
        myDog.eat();

        // 2. Calling a unique method from the child
        myDog.bark();
    }
}
// Parent class (Superclass)

class Animal {

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {

    void bark() {
        System.out.println("The dog barks.");
    }
}
