package people;

public class Person {
    public String name ;
    protected int age;
    private String Atmpin;
    
    public void getName() {
        System.out.println("Name is: " + name);
    }
    
    public void getAge() {
        System.out.println("Age is: " + age);
    }
    
    public void getAtmPin() {
        System.out.println("ATM Pin is: " + Atmpin);
    }
    
    public void getDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("ATM Pin is: " + Atmpin);

        getAtmPin();
    }
}
