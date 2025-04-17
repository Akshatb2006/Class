//Substring And Subsequence
//Substring -- every substring is a subsequence but every subsequence is not substring
//Subsequence -- characters in the same sequence, u can skip some characters but in the same string

//print all possible substring from a string
public class Substring {
    public static void main(String[] args) {
        String str= "abcde";
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}

