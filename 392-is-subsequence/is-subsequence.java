class Solution {
    public static boolean isSubsequence(String s, String t) {

        Queue<Character> charDeque = new ArrayDeque<>();
        StringBuilder scopy = new StringBuilder(s);
        StringBuilder tcopy = new StringBuilder(t);
        
        if (scopy.length() == 0)
            return true;
        
        for (int i = 0; i < scopy.length(); i++) {
            charDeque.offer(scopy.charAt(i));
        }
        
        
        for (int i = 0; i < tcopy.length(); i++) {
            if ( charDeque.size() > 0 && tcopy.charAt(i) == charDeque.peek() ) {
                charDeque.poll();
                if (charDeque.size() == 0) {
                    return true;
                }
            }
        }
        return false;

    }
}