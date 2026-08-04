class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int n = numbers.length;
        int right = n - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
             if(sum == target){
                return new int[]{left + 1, right + 1}; // for 1-indexed
            }
            if(sum < target){
                left++;
            } else {
                right--;
            }
           
        }
        return new int[]{}; // should never reach here 
    }
}
