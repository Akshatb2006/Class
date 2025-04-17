// //print the elements of 1d and 2d array using recursion
// //commented parts are for 1d array
public class Recursion {

    public static void display(int index,int arr[][]) {
       if(index==arr.length){
           return;
       }
    //    System.out.println(arr[index]);
    //    display( index+1, arr);
       for(int i=0;i<arr[index].length;i++){
           System.out.print(arr[index][i]+" ");
       }
       display(index+1,arr);
    }

    // public static void main(String[] args) {
    //     int arr[] = { 1, 2, 3, 4, 5 };
    //     int index=0;
    //     display(index,arr);
    public static void main(String[] args) {
          int [][] arr = { { 1, 2}, { 4, 5 }, { 7, 8 } };
          int index=0;
          display(index,arr);
    }
}

