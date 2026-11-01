class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n =temperatures.length;
        int []ans = new int [n];
        Deque <Integer> st = new ArrayDeque<>();

        for(int i =0; i<n; i++){
            //for each index , we  will find ans using stack
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                //found a warmer day
                int previousday = st.pop();
                 ans[previousday] = i-previousday;

                     }
                     st.push(i);
        }
        return ans;
       
    }
}