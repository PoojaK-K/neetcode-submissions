class Solution {
    public int minimumRecolors(String blocks, int k) {

        int white = 0;

        // Count whites in the first window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                white++;
        }

        int ans = white;

        // Slide the window
        for (int i = k; i < blocks.length(); i++) {

            // Remove left character
            if (blocks.charAt(i - k) == 'W')
                white--;

            // Add right character
            if (blocks.charAt(i) == 'W')
                white++;

            ans = Math.min(ans, white);
        }

        return ans;
    }
}