/*class printEven {
    static void check(int a){
        if (a%2==0){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        for(int i=0; i<=20; i++){
        check(i);
        }
    }
}*/


/*public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}*/

/*class prime{
    static boolean check(int a){
        if(a<2){
            return false;
        }
        if (a==2){
            return true;
        }
        for(int i=2; i<=a/2; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
public static void main(String[] args){
    for(int i=1; i<=50; i++){
        if(check(i)){
            System.out.println(i);
        }
    }
}*/


