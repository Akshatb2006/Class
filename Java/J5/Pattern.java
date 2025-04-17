//linear pattern
public class Pattern {
    public static void main(String[] args) {
        int n=7;
        for (int m = 1; m <= n; m++) {
            for (int k = 0; k < m; k++){
                System.out.print("*");
            }
            System.out.println();  
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            } 
            System.out.println();  
        }
    }
}

        
