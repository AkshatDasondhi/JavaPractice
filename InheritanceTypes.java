class Shape {
  void display() {
      System.out.println("This is a shape.");
  }
}

class Rectangle extends Shape {
  void display() {
      System.out.println("This is a rectangle.");
  }
}

class Square extends Rectangle {
  void display() {
      System.out.println("This is a square.");
  }
}

interface Drawable {
  void draw();
}

interface Movable {
  void move();
}

class Circle implements Drawable, Movable {
  public void draw() {
      System.out.println("Drawing a circle.");
  }
  public void move() {
      System.out.println("Moving a circle.");
  }
}


public class InheritanceTypes {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    rect.display();
    
    Square square = new Square();
    square.display();
    
    Circle circle = new Circle();
    circle.draw();
    circle.move();
}
}

