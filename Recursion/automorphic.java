//is automorphic number or not
public class automorphic {
    public static void main(String[] args) {
        int n = 76;
        int square = n * n;
        int lastDigit = n % 10;
        int squareLastDigit = square % 10;
        if (lastDigit == squareLastDigit) {
            System.out.println(n + " is an automorphic number");
        } else {
            System.out.println(n + " is not an automorphic number");
        }
    }
}
