class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Frequency map
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int num : map.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Build result array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
