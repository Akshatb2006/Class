public class ConstructorStd {
    int x ;
    public ConstructorStd(){
           x=5;
    }
    public static void main(String[] args) {
        ConstructorStd obj=new ConstructorStd();//non parameterised
        System.out.println(obj.x);
    }
}
