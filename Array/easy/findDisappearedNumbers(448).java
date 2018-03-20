//element value range: 1 - n, array size: n -> array boundary range: 0 - n-1. Thus the boundary range just cover the value range
//The basic idea is using the array pivot to record the existence of the value which equals to the pivot + 1. And as we only need to find the value never appear, we can set negative for all the appeared ones.

//Time complexity: O(n)  
//Space complexity: O(n)

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (nums == null) return result;
        
        for (int i = 0;i < nums.length; i++) {
            int j = Math.abs(nums[i]) - 1;
            if (nums[j] > 0) nums[j] = -nums[j];
        }
        
        for (int i = 0;i < nums.length; i++) {
            if (nums[i] > 0) result.add(i + 1);
        }
        
        return result;
    }
}