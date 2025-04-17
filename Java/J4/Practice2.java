/*public class Practice2 {
    public static void main(String[] args) {
        int n =27;
        if(n<=0){
            System.out.println("false");
        }
        while(n%3==0){
           n /=3;}
           if(n==1){
            System.out.println("true");
           }else{
            System.out.println("false");
           }
    }
}*/

/*public class Practice2 {
public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,1,2};
    int product=1;
    for(int i : arr){
        product*=i;
        if(product>0 || product<0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
    
}

class Practice2 {
    public static void main(String[] args) {
        int a = 38;
        while (a >= 10) {
            a = sumOfDigits(a);
        }
        System.out.println("Final result: " + a);
    }

    public static int sumOfDigits(int a) {
        int sum = 0;
        while (a != 0) {
            int digit = a % 10;
            sum += digit;
            a /= 10;
        }
        return sum;
    }
}*/

/*class Practice2{
    public static void main(String[] args) {
        int inp=153;
        int a = (153);
        int result=0;
        int length= String.valueOf(a).length();
         while (a>0) {
            int temp = a%10;
            result += Math.pow(temp, length);
            a/=10;
         }
            if(result==inp){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
            
         
    }
}*/

/*public class Practice2 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        boolean result = true;
        for(int i=0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    result= false;
                    break;
                }
            }
            System.out.println(result);
        }
    }*/
   
/*class Practice2{
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
          int largest = arr[0];
          int seclargest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
        }else if(arr[i]>seclargest && arr[i]!=largest){
            seclargest=arr[i];
        }
    }
    System.out.println(seclargest);
}
}*/

    /*public class Practice2 {
        public static void main(String[] args) {
            int arr[] = {10, 2, 4, 9, 10, 5};
            boolean hasDuplicates = false;
    
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        hasDuplicates = true;
                        break;
                    }
                }
                if (hasDuplicates) {
                    break;
                }
            }
    
            System.out.println(hasDuplicates);
        }
    }*/
    /*import java.util.Arrays;

    public class Practice2 {
        public static void main(String[] args) {
            int[] arr = {0, 1, 5, 10, 2, 1};
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    System.out.println(true);
                    break; 
                }
            }
        }
    }*/

    /*class Practice2{
        public static void main(String[] args) {
            int arr[]={1,2,3,1,5,6};
            int k=3;
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length & j<=i+k; j++){
                    if (arr[i]==arr[j]){
                        System.out.println(true);
                    }
                }
            }
            
        }
    }*/

    /*class Solution {
        public boolean isUgly(int n) {
            if (n <= 0) return false; // ugly numbers are positive
            for (int p : new int[] {2, 3, 5}) {
                while (n % p == 0) n /= p;
            }
            return n == 1;
        }
    }*/

    /*class Practice2 {
        public static void main(String[] args) {
            String S1[] = {"a", "bc"};
            String S2[] = {"ab", "c"};
            String X = "";
            for (String s : S1) {
                X += s;
            }
            String Y = "";
            for (String s : S2) {
                Y += s;
            }
            if (X.equals(Y)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }*/

/*class Practice2{
    public static void main(String[] args) {
       int arr1[]={28,6,22,8,44,17};
       int arr2[]={22,28,8,6};
       for(int i=0; i<arr1.length; i++){
        fr[arr[i]]+=1;
       }
       for(int a:arr2){
        while(fr[a]<0){
          arr1[index++]=a;
        }
       }
    }
}*/
