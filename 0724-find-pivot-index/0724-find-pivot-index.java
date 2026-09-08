class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int leftsum[] = new int[n];
        int rigthsum[] = new int[n];


        //left sum calculated
        leftsum[0]= nums[0];
        for(int i=1; i<n; i++){
            leftsum[i]  = leftsum[i-1] + nums[i];
        }

        //rigth sum calculated
        rigthsum[n-1] = nums[n-1];
        for(int j=n-2; j>=0 ; j--){
            rigthsum[j] = rigthsum[j+1] + nums[j];
        }

        //travel the arrays
        for(int i=0;i<n; i++){
            if(leftsum[i] == rigthsum[i]){
               return i;
            }
        }
       return -1;
    }
}