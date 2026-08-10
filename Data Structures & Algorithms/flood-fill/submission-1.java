class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        // If the color is already the same, nothing to do
        if (originalColor == color) {
            return image;
        }

        int m = image.length;
        int n = image[0].length;

        flood(image, sr, sc, originalColor, color, m, n);

        return image;
    }

    public void flood(int[][] image, int r, int c,
                      int originalColor, int color,
                      int m, int n) {

        // Boundary check
        if (r < 0 || r >= m || c < 0 || c >= n) {
            return;
        }

        // Only change pixels having the original color
        if (image[r][c] != originalColor) {
            return;
        }

        // Change color
        image[r][c] = color;

        // Up
        flood(image, r - 1, c, originalColor, color, m, n);

        // Down
        flood(image, r + 1, c, originalColor, color, m, n);

        // Left
        flood(image, r, c - 1, originalColor, color, m, n);

        // Right
        flood(image, r, c + 1, originalColor, color, m, n);
    }
}