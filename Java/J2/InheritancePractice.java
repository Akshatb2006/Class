class Parent{
    String property = "5Cr";
}
class Child extends Parent{
    String childProperty= property;
}


public class InheritancePractice {
    public static void main(String[] args) {
        Child cd= new Child();
        System.out.println(cd.childProperty);
        System.out.println(cd.property);
    }
}
