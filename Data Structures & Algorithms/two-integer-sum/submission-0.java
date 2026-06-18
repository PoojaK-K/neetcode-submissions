class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Value -> Index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, we found the pair
            if (map.containsKey(complement)) {
                // Return indices: smaller one first
                // Since 'complement' was added earlier, map.get(complement) is smaller
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add current number and its index to the map
            map.put(nums[i], i);
        }

        // Per constraints, a solution always exists
        return new int[] {};
    }
}