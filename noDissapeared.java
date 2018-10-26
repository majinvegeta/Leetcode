/*The array is of size n, having integers such that 1<=a[i]<=n.
    So we iterate through the array and for each element we find the ideal position of the
    element i.e a[i]-1 (if the array were to be sorted with no repitions). We mark the 
    element at the this ideal position negative, as an indicator that this has been 
    visited. If the numbers are repeated, we end up at the same ideal position multiple
    times, so we need to include a check which checks if the number at that position is
    positive. For example, if 5 and 6 are missing, their ideal positions, 4 and 5 will
    never be visited and hence will remain positive. So in the second iteration, we just
    pick the indexes (ideal positions) that are positive and 1 to them to get the missing
    numbers.
    Pro tip -  While calculating the ideal position, we must do Math.abs(a[i])-1, as i
    might have been the ideal position for some other element and would have been marked 
    negative.
*/

public List<Integer> findDisappearedNumbers(int[] nums) {
    for(int i=0;i<nums.length;i++){
        int index = Math.abs(nums[i])-1;
        if(index >= 0 && nums[index]>0){
            nums[index] = -nums[index];
        }
    }
    List<Integer> l = new ArrayList<Integer>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            l.add(i+1);
        }
    }
    return l;
}