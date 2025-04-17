import java.util.Scanner;
public class ErrorSolve {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    String num=sc.nextLine();
    sc.nextLine();
    System.out.println("Enter ur name");
    String name = sc.next()+sc.nextLine();
    System.out.println(num+name+" ,");
    System.out.println(num);
}
    
}