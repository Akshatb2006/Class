/*public class Triplet {
    public static void main(String[] args) {
        int arr1[]={-1,0,4,2,-4};
        int n=arr1.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr1[i]+arr1[j]+arr1[k]==0){
                        System.out.println("triplet" +arr1[i]+ " "+ arr1[j]+ " "+ arr1[k]);
                    }
                }
            }
        }
    }
}*/

/*import java.util.Arrays;
 class Triplet {
    public static void main(String[] args) {
        int arr2[]={-1,0,1,2,-1};
        Arrays.sort(arr2);
        int n=arr2.length;
        
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
            int sum=arr2[i]+arr2[j]+arr2[k];

            if(sum==0){
                System.out.println("triplet: "+arr2[i]+" "+arr2[j]+" "+arr2[k]);
                j++;
                k--;
            }
            else if(sum<0)
            {
                j++;
            }
            else
            {
                k--;
            }
            }
        }
    }
}*/

