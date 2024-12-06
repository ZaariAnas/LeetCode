class Solution {
    
    public int getProd(int [] nums, int index) {
        int prod = 1;
        int cntr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != index)
                prod *= nums[i];
            if (nums[i] == 0)
                cntr++;
        }
        if (cntr == nums.length)
            return 0;
        return prod;
    }

    public int[] productExceptSelf(int[] nums) {
        
        int [] rslt = new int[nums.length];
        int prod = getProd(nums, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                rslt[i] = prod / nums[i];
            else
                rslt[i] = getProd(nums, i);
        }
        return rslt;
    }
}