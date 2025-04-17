//to check whether a given array is palindrome or not
public class palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println(isPalindrome(arr, 0, arr.length-1));
    }
    public static boolean isPalindrome(int[] arr, int i, int j){
        if(i>=j){
            return true;
        }
        if(arr[i]!=arr[j]){
            return false;
        }
        return isPalindrome(arr, i+1, j-1);
    }
}