/*Write an abstract class Shape with an abstract method area(). Create subclasses
Rectangle and Circle that implement the area() method to calculate and return the
area of each shape. Demonstrate abstraction by calling area() on objects of both
subclasses.
 */

abstract class Shape {
    abstract void area();
}            

class Rectangle extends Shape {
    void area() {
        int length = 5;
        int breadth = 10;
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    void area() {
        int radius = 5;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        
        rectangle.area();
        circle.area();
    }   
}
