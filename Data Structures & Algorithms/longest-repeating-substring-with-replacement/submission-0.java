class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int j = 0;
        int maxFreq = 0;
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'A';
            count[index]++;
            maxFreq = Math.max(maxFreq, count[index]);
            int wl = i - j + 1;
            if(wl - maxFreq > k){
                count[s.charAt(j) - 'A']--;
                j++;
            }
            maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen;
    }
}
