import java.util.Arrays;

public class Merge {
   public static void divide(int arr[], int low, int high){
    if(low==high){
        return;
    }
    int mid = low+(high-low)/2;
    divide(arr,low,mid);
    divide(arr,mid+1,high);
    conquer(arr,low,mid,high);
   }
   public static void conquer(int arr[], int low, int mid, int high){
    int temp[] = new int[high-low+1];
    int lp=low;
    int rp=mid+1;
    int tp=0;
    while(lp<=mid&&rp<=high){
        if(arr[lp]<arr[rp]){
            temp[tp]=arr[lp];
            lp++;
            tp++;
        }
        else{
            temp[tp]=arr[rp];
            rp++;
            tp++;
        }
    }
    while(lp<=mid){
        temp[tp]=arr[lp];
        tp++;
        lp++;
    }
    while(rp<=high){
        temp[tp]=arr[rp];
        rp++;
        tp++;
    }
    int op=low;
    for(int val: temp){
        arr[op]=val;
        op++;
    }
   }

    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        int low=0;
        int high= arr.length-1;
        divide(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
