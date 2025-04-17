import java.util.HashSet;

public class LargestSubstring {

    public static boolean allUnique(String str) {
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
        String str = "abccde";
        int maxLength = 0;
        String maxSubstr = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                
                if (allUnique(subStr)) {
                    if (subStr.length() > maxLength) {
                        maxLength = subStr.length();
                        maxSubstr = subStr;
                    }
                }
            }
        }

        System.out.println( maxSubstr);
    }
}
