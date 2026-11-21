class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        
        int arrIndex = 0;
        Deque<Integer> dq= new ArrayDeque<>();

        //step1: process the first window on it
        for(int i=0; i<k; i++){
            int element = nums[i];
           while(!dq.isEmpty() && nums[dq.peekLast()] < element){
            dq.pollLast();
           }

           dq.offerLast(i);
        }

        //find  ans store it
         ans[arrIndex] = nums[dq.peekFirst()];
         arrIndex++;
    

    //Step 2: process remaning window -> addition , remove , find ans
    for(int i =k; i<n; i++){
        //remove
     while(!dq.isEmpty() && dq.peekFirst()<= i-k){
        dq.pollFirst();
     }
        //addition
        while(!dq.isEmpty() && nums[dq.peekLast()] <nums[i]){
            dq.pollLast();
        }
        dq.offerLast(i);

        ///find ans
        ans[arrIndex] = nums[dq.peekFirst()];
        arrIndex++;

       
    }
     return ans;
    }
}