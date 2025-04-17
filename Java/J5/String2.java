import java.util.Scanner;

public class String2 {
    //Question 1
    private static Character convert (Character c){
           if(c>='A'&& c<='Z'){
            char d = (char)(c+32);
            return d;
           }
           return c;
    }
    //Question 2:
    public static boolean check(String str){
        for(char c: str.toCharArray()){
            if(c>='A'&& c<='Z'|| c>='0' && c>='9' || c>='a'&& c>='z'){
                return true;
            }
        }
                return false;
            
        }
        //Question 3:
            public static boolean isPalindrome(String str) { 
                int left = 0; 
                int right = str.length() - 1; 
                while (left < right) { 
                    if (str.charAt(left) != str.charAt(right)) { 
                        return false; 
                    } 
                    left++; 
                    right--;
                 } 
                 return true;
                }
    
    public static void main(String[] args) {
        // char c = 'a';
        // char c2 = 'A';
        // question 1:System.out.println(c-c2);
        //write a java program to convert a string to lowerCase without using .toLowerCase
        //   String str="aBcD";
        //   String res = "";
        //   for(int i=0; i<str.length(); i++){
        //     res=res+convert(str.charAt(i));
        //   }
        //   System.out.println(res);
        //Question 2: check all the values are only alphanumeric in a given string
        // ex- a9h6 -> true
        // ex- a_h6 -> false // _is not a alphanumeric
        //Question 3: check whther given string is palindrome or not
        // ex -> aba -> true
        // ex -> abb -> false
        // String str= "a9h6";
        //     System.out.println(check(str));
        //     for(int i=0; i<10; i++){
        //         System.out.println((char)i);
        //     }
             Scanner sc= new Scanner(System.in);
             System.out.println("enter the string");
             String input = sc.nextLine();
             System.out.println( input);
             if (isPalindrome(input)) { 
                System.out.println("true"); 
                 } else {
                 System.out.println("False"); 
                }
                 sc.close();
        }
    }
