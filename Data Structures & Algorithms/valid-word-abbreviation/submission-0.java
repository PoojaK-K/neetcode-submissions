class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0; // pointer for word
        int j = 0; // pointer for abbr

        while (i < word.length() && j < abbr.length()) {

            // If current character is a letter
            if (Character.isLetter(abbr.charAt(j))) {
                if (word.charAt(i) != abbr.charAt(j)) {
                    return false;
                }
                i++;
                j++;
            } 
            // If current character is a digit
            else {
                // Leading zero is invalid
                if (abbr.charAt(j) == '0') {
                    return false;
                }

                int num = 0;

                // Build the number
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                // Skip characters in word
                i += num;
            }
        }

        // Both pointers should reach the end
        return i == word.length() && j == abbr.length();
    }
}