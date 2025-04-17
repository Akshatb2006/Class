//find the max element in the array using recursion
public class max {
    public static int maxarr(int[] arr, int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int result = Math.max(arr[i], maxarr(arr, i+1));
        return result;
    }        
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(maxarr(arr, 0));
    }
}