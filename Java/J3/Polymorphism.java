 class parent {
    public void add(int a, int b) {
        System.out.println("This is sum:"+(a+b));
    }
}
class child extends parent{
    public void add(int a, int b) {
        System.out.println("Sum:"+(a+b));
    }
}
class Polymorphism{
    public static void main(String[] args) {
        child obj=new child();
        obj.add(7, 5);
    }
}