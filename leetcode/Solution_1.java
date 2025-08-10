class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Approach 1 - Brute Force
        // int result[] = new int[2];
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i+1; j< nums.length; j++){
        //         if(nums[i]+nums[j] == target && i != j){
        //             result[0] = i;
        //             result[1] = j;
        //         }
        //     }
        // }
        // return result;

        // Approach 2 - 1 Pass Hash Map
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]