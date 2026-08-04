class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder rev = new StringBuilder(cleaned).reverse();
        return cleaned.equals(rev.toString());
    }
}
