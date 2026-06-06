class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int complement = target - currentNumber;
            if (result.containsKey(complement)) {
                return new int[] {result.get(complement), i};
            } else {
                result.put(currentNumber, i);
            }
        }

        return new int[] {};
    }
}
