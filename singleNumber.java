/* XOR of a number with itself is 0. As the value of XOR of two bits is 1 only when they are different. 
    Hence, two find out the unique number, we take xor of all the elements in the array. The elements repeated
    even number of times cancel out, leaving the integer that is present once.
    FYI , n ^ 0 = n, where n is an integer.
*/

public int singleNumber(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[0]^=nums[i];
        }
        return nums[0];
    }