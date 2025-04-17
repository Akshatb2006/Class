//reverse a string using recursion
public class reversestr {
    public static void main(String[] args) {
        String str= "hello";

        System.out.println(reverse(str, 0, str.length()-1));
    }
    public static String reverse(String str, int start, int end) {
        if(start>=end){
            return str;
        }
        char[] arr = str.toCharArray();
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverse(new String(arr), start+1, end-1);
    }
}
