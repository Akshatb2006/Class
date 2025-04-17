   import java.util.Arrays;
import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print("Element " + (i+1) + ": ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("The elements of the array are:");
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int[][] matrix = new int[row][col];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println(Arrays.deepToString(matrix));
//     }
// }


public class Main {
    public static void main(String[] args) {
        int[][] matrix={
            {2,8,10},
            {10,30,80}
        };
        int i=0;
        do{
            int j=0;
            do{
                System.out.println(matrix[i][j]+" ");
                j++;
            }while(j<matrix[i].length);
                System.out.println();
                i++;
        }while(i<matrix.length);
    }
}