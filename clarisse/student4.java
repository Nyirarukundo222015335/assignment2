 class student4 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();  // Inherited from Animal
        myCat.meow();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}








