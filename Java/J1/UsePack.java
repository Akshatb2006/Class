import java.util.Scanner;
import calculator.createpack;
public class UsePack {
    public static void main(String[] args) {
        calculator.createpack obj= new createpack();
        Scanner sc= new Scanner(System.in);
        int first=sc.nextInt();
        System.out.println("Enter first number:");
        int second=sc.nextInt();
        System.out.println("Enter second number:");
        
        obj.add(first, second);
        obj.sub(first, second);
        obj.mul(first, second);
        obj.div(first, second);
    }
}
