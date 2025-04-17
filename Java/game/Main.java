import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " \uD83E\uDD8F\uD83E\uDD8F\uD83D\uDC4C");
        
        int count = 1;
        int cmp = new Random().nextInt(100) + 1;
        
        while (true) {
            System.out.print("Enter number between 1 to 100: ");
            int inp = scanner.nextInt();
            
            if (inp < cmp) {
                System.out.println("ur guessed number is less ");
            } else if (inp > cmp) {
                System.out.println("ur guessed number is more");
            } else {
                System.out.println("Congrats OH YEAH!! you are eligible for free reward as u guessed the number in " + count + " times");
                break;
            }
            count++;
        }
        
        System.out.println("Computer's number was: " + cmp);
        checkNumber(cmp);
        scanner.close();
    }
    
    public static void checkNumber(int num) {
        if (num <= 1) {
            System.out.println("It's neither prime nor composite");
            return;
        }
        if (num == 2) {
            System.out.println("It's a prime number");
            return;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("It's a composite number");
                return;
            }
        }
        System.out.println("It's a prime number");
    }
}
