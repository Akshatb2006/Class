//reverse the array using recursion
//return the reverse output in an array
public class reversearr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] reversedArr = reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.println(reversedArr[i]);
        }
    }
    public static int[] reverse(int[] arr, int i, int j) {
        if (i >= j) {
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return reverse(arr, i + 1, j - 1);
    }
}