interface legacy{
    abstract public void culture();
}
class HotelStaff implements legacy{
    public void culture(){
        System.out.println("Good Job!! My Child😇😇");
    }
}
public class ImplementationEx {
    public static void main(String[] args) {
        HotelStaff obj = new HotelStaff();
        obj.culture();
    }
}
