class Solution {

   static boolean isvalidAnswer(int [] nums , int k , int maxpages){
    int studentcount =1;
    int pages =0;
    
    for(int i =0; i<nums.length; i++){
        if(pages + nums[i] <= maxpages){
            //iske multb current book can assigned
            // as it is not out of limit
            //ten assign
            pages = pages + nums[i];
        }
        else{
            studentcount++;
            if(studentcount > k){
                return false;
            }
            if(nums[i] > maxpages){
                return false;
            }

            else{
                pages =0;
                pages = pages + nums[i];
            }
        }
    }
    return true;
   }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int s =1;
        int sum =0;
        for(int i =0; i<n; i++){
            sum += nums[i];
        }
        int e = sum;
        int ans =0;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isvalidAnswer(nums , k , mid)){
                //true wali case
                ans = mid;
                e =mid -1;

            }
            else{
                //false wali case
                s =mid +1;
            }
        }
        return ans;
    }
}