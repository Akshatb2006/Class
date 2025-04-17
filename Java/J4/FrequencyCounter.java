public class FrequencyCounter {
    public static void main(String[] args) {
        int arr[]={1,2,2,4,3,5,7,3};
        int res[]= new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            res[arr[i]]++;
        }
        for(int i=0; i<res.length; i++){
            if(res[i]>1){
                System.out.println(i);
                //break; break will stop the output for the first result
            }
        }
    }
}
