class Solution {
    public void moveZeroes(int[] nums) {
      //  step 1 :  calculat the length of nums
        int n = nums.length;

        //step 2 : place the first pointer on 0 index 
        int i =0;
        //step 3 : place the second pointer on  0 or 1 index 
        for(int j = 0; j<n; j++){
            
            // step 4 : if the 0 is come in the index so the swap the index by first index.
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

              // after the swap increment the i index by one position.
                i++;
            }
            
        
        }
    
    }
}