class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        // Count frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        // Find maximum odd and minimum even frequency
        for (int f : freq) {
            if (f == 0) continue;

            if (f % 2 == 1) {
                maxOdd = Math.max(maxOdd, f);
            } else {
                minEven = Math.min(minEven, f);
            }
        }

        return maxOdd - minEven;
    }
}