public class p {
    String name;
    int age;
    void display(String name , int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        p obj1 = new p();
        obj1.display("hdfc",90);
        System.out.println(obj1.name);
    }
}
