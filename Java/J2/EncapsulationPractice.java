class capsule{
    static int medprice = 10;
    private int profit = 20;
    private int Sprice = medprice+profit;
    public void getPrice(){
        System.out.println(Sprice);
    }
}



public class EncapsulationPractice {
    static int checkStatic=5;
    public static void main(String[] args) {
        capsule obj=new capsule();
        obj.getPrice();
        System.out.println(capsule.medprice);
        EncapsulationPractice obj1 = new EncapsulationPractice();
        System.out.println(obj1.checkStatic);
    }
}
