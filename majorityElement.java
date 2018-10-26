/* Approach 1 -  calculate the frequency, and find the max element/find the element with count > floor(n/2)*/

public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i : nums){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }else{
            map.put(i,1);
        }
    }
    int max = Integer.MIN_VALUE;
    int ele = 0;
    for(int key : map.keySet()){
        if(map.get(key) > max){
            max = map.get(key);
            ele = key;
        }
    }      
    return ele;
}

/* Approach 2 - Boyer - Moore voting algorithm
Think of it as a game, where many groups are fighting for the throne. Each group has
its own army. Any soldier can kill other group’s soldier only by suicidal attack.
Now no matter who ever fights with whom, or how it starts, the one with more than 
half will always win. In worst half case, every group is aiming for the biggest group
 and nobody wins.
 FYI, if we aren't sure if a majority element exists...check if the frequency of the
 candidate is greater than floor(n/2).
*/

public int majorityElement(int [] nums){
    int candidate = nums[0];
    int count=0;
    for(int i=1;i<nums.length;i++){
        if(count==0) candidate = nums[i];
        count+= (nums[i]==candidate)? 1 : -1;
    }
    return candidate;
}
