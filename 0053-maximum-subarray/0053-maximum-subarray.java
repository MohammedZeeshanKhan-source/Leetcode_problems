class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum =0;
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<n; i++){
            //step 1 : sum create krte h
            sum = sum + nums[i];

            //step2: max update krte h

            max = Math.max(max,sum);


            //step3: sum check krte hai for negative numbers
            if(sum<0){
                sum = 0;
            }
        }
           return max;
    }
}