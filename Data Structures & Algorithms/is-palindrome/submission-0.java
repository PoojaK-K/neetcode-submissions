class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();      
        StringBuilder sb = new StringBuilder();
        String rev = sb.reverse().toString();  
        return s.equals(rev);
    }
}
