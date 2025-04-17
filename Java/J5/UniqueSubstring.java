import java.util.HashSet;

public class UniqueSubstring {

  
    public static boolean AllUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abbcde";
 
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                

                if (AllUnique(subStr)) {
                    System.out.println(subStr);
                }
            }
        }
    }
}


























