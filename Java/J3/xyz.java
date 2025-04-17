abstract class Parent {
    abstract public void language();
    
    public void message() {
        System.out.println("I am concrete method");
    }
}

class Main1 extends Parent {
    public void language() {
        System.out.println("Hindi");
    }
}

public class xyz {
    public static void main(String[] args) {
        Main1 obj = new Main1();
        obj.language();
        obj.message();
    }
}
