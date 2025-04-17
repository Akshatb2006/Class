// //print numbers below n using recursion 
// public class Recursion {
//     public static void print(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         print(n - 1);
//     }

//     public static void main(String[] args) {
//         print(5);
//     }
// }  

// //print numbers in increasing order using recursion 
// public class Recursion {
//     public static void print(int n) {
//         if (n == 0) {
//             return;
//         }
//         print(n - 1);
//         System.out.println(n);
//     }

//     public static void main(String[] args) {
//         print(5);
//     }   
// }

// //print factorial of a number using recursion
// public class factorial{
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         return n*fact(n-1);
//     }
    
//     public static void main(String[] args){
//         System.out.println(fact(5));
//     }
// }

//power of linearnumber using recursion
public class linear{
    public static int power(int n, int p){
        if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}