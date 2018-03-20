// The basic idea is sorting firstly, then for every unique value, decide whether the n/2 position after is still the same value //(Since the question assume the majority element always exist, we can spare some corner case check.

//Time complexity: O(nlgn)
//Space complexity: O(1)
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int length = nums.length;
        for (int i = 0;i <= length/2; i++) {
            if (i != 0 && nums[i] == nums[i-1]) i++;
            int j = i + length/2;
            if (nums[i] == nums[j]) {
                result = nums[i];
                break;
        }    
    }
        return result;
}
}