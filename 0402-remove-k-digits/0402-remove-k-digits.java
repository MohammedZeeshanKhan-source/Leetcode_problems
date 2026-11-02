class Solution {
    public String removeKdigits(String num, int k) {
        
        Deque<Character> st = new ArrayDeque<>();

        //apply monotonic stack pattern on input string
        for(char  ch : num.toCharArray()){
            while(!st.isEmpty()&& k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            //insert the current character 
            st.push(ch);
        }

        //step2: agar kuch removal is till pending h , toh take care of it
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
       // step 3: build your ans string ,reverse it remove leading zero remove stringbuilder //ans new string builder
      StringBuilder ans = new StringBuilder();
      while( !st.isEmpty()){
        ans.append(st.peek());

        st.pop();
      }
      ans.reverse();

     // step 4: removing leading Zero on it 
     int index =0;
     while(index < ans.length() && ans.charAt(index) == '0'){
        index ++;
     }
      String result = ans.substring(index);

      if(result.length() == 0 ){
        return "0";
      }
      else{

        return result;
      }
 


    }

}