class Parent{
    public void mul(int a, int b){
        System.out.println("This is multiplication:"+(a+b));
    }
}
class Child extends Parent{
    public void mul(int a, int b){
       System.out.println("Multiplication:"+(a*b));
    }
}
public class PolymorphismEx {
    //compile time polymorphism
    static void add(int a, int b){
        System.out.println("This is sum:"+(a+b));
    }
    //method overloading
    static void add(int a, int b, int c){
        System.out.println("Sum:"+(a+b+c));
    }
    public static void main(String[] args) {
        //add(2, 3);
        //add(2, 6, 9);
        Child obj=new Child();
        Parent pt = new Parent();
        pt.mul(4, 5);
        obj.mul(2, 3);
    }
}
