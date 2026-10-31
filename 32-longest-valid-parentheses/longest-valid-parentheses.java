class Solution {
    public int longestValidParentheses(String s) {
        int open =0;
        int close = 0;
        int maxlen = 0;

      for(int i =0; i<s.length(); i++){
        char ch = s.charAt(i);

        if(ch == '('){
            open ++;
        }
        else{
            close++;
        }
        //checks for invlalid or valid case
        if(close > open){
            //invlalid case
            //reset
            open =0;
            close =0;
        }
        else if (open == close){
            //valid
            maxlen = Math.max(maxlen , 2* close);
        }
      }

      open =0;
      close =0;

      for(int i =s.length()-1; i>=0; i--){
        char ch = s.charAt(i);

        if(ch == '('){
            open++;
        }
        else{
            close++;
        }
        if(open > close){
            //ivalid case
            open =0;
            close =0;
        }
        else if (open == close){
            maxlen = Math.max(maxlen , 2*open);
        }
      }



        return maxlen;
    }
}