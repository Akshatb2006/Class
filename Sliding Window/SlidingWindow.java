//Sliding Window
//sub-Arrays or sub-String
//maximum sum, minimum sum
//repetitive operations
// 1-fixed size => window will be always there ex- max sum of subarray with size k
// 2-variable size=> ex- longest substring, maximum sum, minimum sum of subarray

// 1.fixed
//Question-- nums=[2,3,4,5,-2,4,6] find maximum sum for window size k=4
public class SlidingWindow {
                 public static void main(String[] args) {
                    int[] nums={2,3,4,5,-2,4,6};
                    int k=4;
                    int maxSum=Integer.MIN_VALUE;
                    int windowSum=0;
                    for(int i=0; i<k; i++){
                        windowSum+=nums[i];
                    }
                    maxSum=windowSum;// we have assigned the value of windowSum to maxsumo
                    for(int i=k; i<nums.length; i++){
                        windowSum= windowSum+nums[i]-nums[i-k];
                        maxSum=Math.max(maxSum, windowSum);
                    }
                    System.out.println(maxSum);
                 }
}