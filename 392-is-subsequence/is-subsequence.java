class Solution {
    public static boolean isSubsequence(String s, String t) {

        int ptr = 0;
        if (s.isEmpty())
            return true;
        
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(ptr))
                ptr++;
            if (ptr == s.length())
                return true;
        }
        

        
        return false;

    }
}