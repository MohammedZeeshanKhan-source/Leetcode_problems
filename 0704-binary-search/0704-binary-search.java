class Solution {
    static int  BinarySearch(int [] nums , int target , int s , int e){
        //Base Case
        if(s > e){
            return -1;
        }
        //Processing Or Binary Search ka Logic
        int mid = s + (e-s)/2;

        if(nums[mid] == target){
            return mid;
        }
        
        if(nums[mid] > target){
            //move to left
            e = mid -1;
        }
        else if(nums[mid] < target){
            //move to rigth
            s = mid +1;
        } 
        //Recusion Call in Binary search
        return  BinarySearch(nums, target , s,e);
    }

    public int search(int[] nums, int target) {
        int s = 0 ;
        int e = nums.length -1;

        int ans = BinarySearch(nums , target , s, e);
        return ans;
    }
}