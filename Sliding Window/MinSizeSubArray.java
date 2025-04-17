//Find the minimum length of a subarray whose sum is equal to target
public class MinSizeSubArray {
    static int MinSizeSubArray(int[] arr, int target){
        int ws=0;
        int wSize=Integer.MAX_VALUE;
        int left=0;
        for(int right=0; right<arr.length-1; right++){
            ws+=arr[right];
            while(target<=ws){
                if(target==ws){
                   wSize=Math.min(wSize, right-left+1);
                }
                ws=ws-arr[left];
                left++;
            }
        }
        return wSize==Integer.MAX_VALUE?0:wSize;
    }
}
