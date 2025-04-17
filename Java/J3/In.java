interface contract{
    abstract public void legacy();
    default public void message() {
        System.out.println("this is legacy interface");
    }
}
class HotelStaff implements contract{
    public void legacy(){
        System.out.println("Welcome");
    }
}
public class In {
    public static void main(String[] args) {
        HotelStaff obj=new HotelStaff();
        obj.legacy();
        obj.message();
    }
}
