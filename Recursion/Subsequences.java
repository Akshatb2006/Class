//print Subsequences
//given a string print all the subsequences of the string using recursion

import java.util.ArrayList;

class Subsequences {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = new ArrayList<>();
        ans = printSubsequences(str);
        System.out.println(ans);
    }
    static ArrayList<String> printSubsequences(String str){
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        char ch = str.charAt(0);
        String rem_String = str.substring(1);

        ArrayList<String> rem_Subsequence = new ArrayList<>();
        rem_Subsequence = printSubsequences(rem_String);

        for(String s : rem_Subsequence){
            myAns.add(s+"");
            myAns.add(ch + s);
        }
                return myAns;
        
        }
    }
