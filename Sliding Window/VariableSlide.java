//find the minimum length of subArray whose sum is equal to target
//constraint A= only positive integers

public class VariableSlide {
  static int minSublen(int arr[], int target){
    int start=0;
    int end=0;
      int ws=Integer.MAX_VALUE;
      int cs=0; 
      while (start<end && end<arr.length) {//start 1, end =2, cs=3
        //until cs>=target
        while (cs<target || start<end) {
          cs=cs+arr[end];      //cs=3+2=5, end=3
          end++;         //end=0, start=0   //4<target// 7<target  false end=1
        }
        while (cs>target) {
          cs=cs-arr[start];      // start=0, cs=7-4 cs=3, start=1
          start++;
        }
        if(target==cs){
          ws=Math.min(ws, end-start+1);     //3-1+1=3
        }
        end++;   //end=2
      }
      return 0;
  }
          public static void main(String[] args) {
            int nums[]={4,3,2,1,5};
            int target=5;
            int ws = minSublen(nums, target);
            System.out.println("Minimum subarray length: " + ws + ", Target: " + target);

          }    
}