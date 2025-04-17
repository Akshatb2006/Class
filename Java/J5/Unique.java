import java.util.HashSet;

public class Unique {
    public static boolean check(String str){

       //contains all unique characters or not
        // str = abccd //false
        // str = abcd //true
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
            }
           return true;
        }
        //optimised method
    public static boolean check2(String str){
        HashSet<Character> set= new HashSet<>();
        for(int i=0; i<str.length(); i++){
            if(set.contains(str.charAt(i))){
                return false;
        }
        set.add(str.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(check(str));
        System.out.println(check2(str));
        }
    }
