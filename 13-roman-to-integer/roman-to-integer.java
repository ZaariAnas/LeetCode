class Solution {
    private static final Map<Character, Integer> romans = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000    
    );

    public int romanToInt(String s) {

        StringBuilder str = new StringBuilder(s);
        int sum = 0, prev = 0;
        
        for (int i = str.length() - 1; i >= 0; i--) {
            int value = romans.get(str.charAt(i));

            if (value < prev){
                sum -= value;
            } else {
               sum += value;
            }
            prev = value;
        }
        return sum;
    }
}