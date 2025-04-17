public class towerofhanoi {

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int n, char T1, char T2, char T3) { 
        if(n==0){
            return;
        }
        towerOfHanoi(n - 1, T1, T3, T2);
        System.out.println("Move disk " + n + " from " + T1 + " to " + T2);
        towerOfHanoi(n-1, T3, T2, T1);
    }
}