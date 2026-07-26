class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        int[] pos = new int[26];
        
        // Store the position of each character in alien order
        for (int i = 0; i < order.length(); i++) {
            pos[order.charAt(i) - 'a'] = i;
        }
        
        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            if (!check(words[i], words[i + 1], pos)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean check(String a, String b, int[] pos) {
        int n = Math.min(a.length(), b.length());
        
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return pos[a.charAt(i) - 'a'] < pos[b.charAt(i) - 'a'];
            }
        }
        
        // If first n characters are same, shorter word should come first
        return a.length() <= b.length();
    }
}