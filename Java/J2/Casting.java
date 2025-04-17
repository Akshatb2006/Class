/*class Casting {
public static void main(String[] args) {
    int a=5; //implicit widening
    double b =a;
    long c =a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
    
}**/

//explicit casting
class Casting {
    public static void main (String[] args) {
      double a = 5.0;
      int b = (int) a;
      long c = 723;
      int d = (int) c;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
}
  }