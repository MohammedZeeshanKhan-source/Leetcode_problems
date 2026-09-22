class Solution {
  static boolean isvalidAnswer(int nums [], int k, int maxpages){
    int studentcount = 1;
    int totalpages = 0;
   for(int i=0; i<nums.length; i++){
      if(totalpages + nums[i] <= maxpages){

        totalpages = totalpages + nums[i];
      }

      else{
        studentcount ++;
        totalpages = 0;

        if(nums[i] > maxpages || studentcount > k){
            return false;
            
        }
      else{
           totalpages =0;
           totalpages = totalpages + nums[i];
      }

      }
     
   }

     return true;

  }

    public int splitArray(int[] nums, int k) {
        int sum =0;
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
        }
        int s=0;
        int e =sum;
        int ans =-1;

        if(nums.length < k){
            return -1;
        }
        while(s<=e){
            int mid = s+ (e-s)/2;

            if(isvalidAnswer(nums,k,mid)){
                ans = mid;
                e= mid - 1;
            }
            else{
                s= mid + 1;
            }
        }
          return ans;
    }
}