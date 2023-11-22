 class student {
    public static void main(String[] args) {
        B obj = new B();

        // Accessing members of class A through class B
        obj.a = 10;
        obj.displayA();

        // Accessing members of class B
        obj.b = 20;
        obj.displayB();
    }
}

class A {
    int a;

    void displayA() {
        System.out.println("Class A: " + a);
    }
}

class B extends A {
    int b;

    void displayB() {
        System.out.println("Class B: " + b);
    }
}

