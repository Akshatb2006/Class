//1. String literal  -->immutable --> non changeable
// space optimisation
//2. String buffer   -->mutable sequence of characters
//   StringBuffer str1 = new StringBuffer("Testing")
//    performs synchronisation
//    safety
//3. String Builder  -->mutable sequence of characters --- faster than StringBuffer
//   StringBuilder str = new STringBuilder("hello")
//   not thread safe.....will not perform synchronisation
//   make it faster


/*import java.lang.StringBuilder;
import java.lang.StringBuffer;
public class str {
    public static void main(String[] args) {
        String str= "hello ";
        System.out.println(str);
        System.out.println( str.concat("world"));

        StringBuilder Str = new StringBuilder("hello");
        System.out.println(Str);
        Str.append(" world");
        System.out.println(Str);

        StringBuffer str1 = new StringBuffer("Testing ");
        str1.append("world");
        System.out.println(str1);

    }
    

}*/
//String literal methods:
//1.  .length()
//  Ex-- String str="Once"; str.length()//4
//2.  .charAt(index)
//  str.charAt(1)//n
//3.  toUpperCase()
//  str.toUpperCase()
//4.  .toLowerCase()
//  str.toLowerCase()
//5.  .equals(string)
//  str.equals("hello")// true or false
//6.  .concat(string)
//  str.concat("upon")
//7. .toCharArray()
// str.toCharArray()//['o','n','c','e']

//String Builder and String Buffer methods:
//1.  .toString --> converts StringBuilder to String
//2.  .append() --> Adds String at last
//3.  .delete(starting index, ending index) 
//4.  .insert(index,value)
//5.  .reverse()



//1.Create a string which stores name of a person and create a method which adds last name in orginal string 
//2.Write a java program to reverse a string 

/*public class Innerstr {
     public static void main(String[] args) {
        StringBuilder Str = new StringBuilder("Akshat");
        System.out.println(Str);
        Str.append(" Baranwal");
        System.out.println(Str);
        String str1=new String(Str.reverse().toString());
        System.out.println(str1);
     }
    
}*/