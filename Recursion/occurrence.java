//find first occurrence of an integer in an array using recursion
public class occurrence{
    public static int first(int arr[], int n, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return first(arr, n, i+1);
    }
    //find last occurrence of an integer in an array using recursion
    public static int last(int arr[], int n, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
    return last(arr, n, i-1);
    }
    //find all the occurrences of an integer in an array using recursion
    public static void all(int arr[],int n, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==n){
            System.out.println(i);
        }
        all(arr,n,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,4};
        int n=4;
        System.out.println("last occurence of " + n + " is " +last(arr, 4, arr.length-1));
        System.out.println("first occurence of " + n + " is " +first(arr, 4, 0));
        System.out.println("all the occurence of " + n + " are: ");
        all(arr, 4, 0);
    }
}