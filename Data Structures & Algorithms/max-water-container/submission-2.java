class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int maxWater = 0;
        int r = n - 1;
        while(l < r){
            int width = r - l;
            int minH = Math.min(heights[l], heights[r]);
            int area = width * minH;
            maxWater = Math.max(area, maxWater);
            if(heights[l] < heights[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxWater;
    }
}
