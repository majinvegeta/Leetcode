/*Given an array nums, write a function to move all 0's to the end of it while maintaining
 the relative order of the non-zero elements.

 The idea is to count the number of zeroes until the first non zero. Then, swap the number with the
 position (i - zCount), So that the number is before all the zeroes. The count of zeroes remains the
 same since, the previous place of the number would be set to zero.

 Time complexity is O(n), but more optimal than the below solution as the number of writes is equal
 to the number of non zero elements. 
 */

public void moveZeroes(int[] nums) {
    int zCount = 0,i=0;
    while(i<nums.length){
        if(nums[i]==0){
            zCount++;
        }else if(zCount!=0){        // no need to swap if there are no zeroes before the number.
            nums[i-zCount] = nums[i];
            nums[i]=0;
        }
        i++;   
    }    
}

/* Sub Optimal solution - put the non zero elements at the beginning. Fill the rest of the array with zeroes.
    Time complexity is O(n), as there are n writes.
*/

public void moveZeroes(int [] nums){
    int properPos = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[properPos++] = nums[i];
        }
    }
    for(int i=properPos;i<nums.length;i++){
        nums[i]=0;
    }
}