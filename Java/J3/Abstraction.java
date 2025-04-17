abstract class StrictParent{
    abstract public void language();
    private void message(){
        System.out.println("I am concrete method");
    }
    public void getmessage(){
        this.message();
    }
}
class ScaredChild extends StrictParent{
    public void language(){
        System.out.println("Hindi");
    }
    public void plan(){
        System.out.println("Will play with friends");
       
    }
    public void greeting(){
        System.out.println("Hallo Leute Guten Tag");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        ScaredChild obj  = new ScaredChild();
        obj.language();
        obj.plan();
        obj.getmessage();
        obj.greeting();
    }
}
