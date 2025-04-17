public class BinarySearch {
    static int bsearch(int arr[], int target){
          int left = 0;
          int right = arr.length-1;
          while (left<=right) {
            int mid = (left + right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right=mid-1;
            }
          }
          return-1;
    }
    public static void main(String[] args) {
        int data[]={1,2,3,4,5,6,7};
        int target= 5;
        int res =bsearch(data, target);
        System.out.println(res);
    }
}
