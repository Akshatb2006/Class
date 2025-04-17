/*public class Fibonacci {
public static void main(String[] args) {
    int f=0;
    int s=1;
    for(int i=0; i<5; i++){
        System.out.println(f);
        int next= f+s;
         f=s;
         s=next;
    }
}
    
}*/

/*public class Fibinocci {
    public class Fibonacci {
        public static void main(String[] args) {
            int n = 10;
            int[] fibSeries = new int[n];
            fibSeries[0] = 0;
            fibSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(fibSeries[i] + " ");
            }
        }
    }*/
    public class Fibonacci {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }
    }