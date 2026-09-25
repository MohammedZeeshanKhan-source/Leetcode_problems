class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int n = nums.length;
       int max = Integer.MIN_VALUE;
       int count = 0;
       for(int val : nums){
        if(val == 1){
            count++;
        }
        else{
            count = 0;
        }

        if(count > max){
            max = count;
        }
       }
       return max;
    }
}
 
