 class student5 {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();  

        Square mySquare = new Square();
        mySquare.draw();  
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}

















