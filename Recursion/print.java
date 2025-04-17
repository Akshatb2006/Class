//find the sum of array using recursion
// public class sumarray{
//     public static int sumarr(int[] arr, int i){
//         if(i==arr.length){
//             return 0;
//         }
//         int result = arr[i] + sumarr(arr, i+1);
//         return result;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7};
//         System.out.println(sumarr(arr, 0));
//     }
// }



//print the array using recursion in both directions
public class print{
    public static void printinc(int arr[], int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        printinc(arr, i+1);
    }
    public static void printdec(int arr[], int i){
        if(i<0){
            return;
        }
        System.out.println(arr[i]);
        printdec(arr, i-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printinc(arr, 0);
        System.out.println("-------------");
        printdec(arr, arr.length-1);
    }
}