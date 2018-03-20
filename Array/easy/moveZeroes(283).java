//The basic idea is moving the non-zeros which are after zeros backward in one pass.So we can consider two pointers, one keep the head of zeros, and another one keep the head of non-zeros which are after the zeros. So the problem converts to how to initiate and update pointers.
    
//Time complexity : O(n) 
//Space complexity: O(1)

public class Solution {
    public void moveZeroes (int[] nums) {
         
        if (nums == null) return;
        
        // find the first zero
        int zero;
        for(zero = 0; zero < nums.length; zero++) {
            if (nums[zero] == 0) break;
        }
        if(zero >= nums.length - 1) return;
        
        // make the movement
        for (int nonzero = zero + 1; nonzero < nums.length; nonzero++) {
            if (nums[nonzero] == 0) continue;
            else {
                nums[zero] = nums[nonzero];
                nums[nonzero] = 0;
                zero++;
            }
        }
    }
}