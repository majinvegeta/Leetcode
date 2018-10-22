/* XOR of a number with itself is 0. As the value of XOR of two bits is 1 only when they are different. */

public int singleNumber(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[0]^=nums[i];
        }
        return nums[0];
    }