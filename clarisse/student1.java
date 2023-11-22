 class student1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");

        // Accessing members of class Animal through class Dog
        myDog.eat();

        // Accessing members of class Dog
        myDog.bark();
    }
}
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Call to the superclass constructor
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}



