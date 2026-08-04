class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int num : nums){
        if(!set.add(num)){
            return true; // idnicating there's a duplicate
        }
       }
       return false;
    }
}