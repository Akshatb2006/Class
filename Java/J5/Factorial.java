import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
public static BigInteger fact(int n){
    //base condition
    if(n<=1){
       return BigInteger.ONE;
    }
    return BigInteger.valueOf(n).multiply(fact(n - 1));
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    System.out.println("result" + " " + fact(n));
}
}
