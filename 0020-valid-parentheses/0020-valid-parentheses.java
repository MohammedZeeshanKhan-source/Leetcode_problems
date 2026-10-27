class Solution {
    public boolean isValid(String s) {
       Deque <Character> st = new ArrayDeque<>();

       for(char ch : s.toCharArray()){
        //if this is a open bracket
        if(ch == '(' || ch == '{' || ch == '['){
            st.push(ch);
        }

        else{
            //if ch is closing bracket
            //we are going to check stack top
            //but best practic is to check first whether stack is empty or not
            if(st.isEmpty()){
                return false;
            }
            if(ch == ')'&& st.peek() != '('){
                return false;
            }
            else if(ch == '}' && st.peek() != '{'){
                return false;
            }
            else if(ch == ']' && st.peek() != '['){
                return false;
            }
            else{
                   //match 
                   st.pop();

            }
            
        }
       
       }
       
        //if stacks is empty then iske matl
        if(st.isEmpty()){
            return true;
        }

        else{
            return false;
        }
     
        }
  } 