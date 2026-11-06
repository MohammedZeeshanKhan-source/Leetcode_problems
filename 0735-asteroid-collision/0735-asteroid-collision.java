class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Deque<Integer> st = new ArrayDeque<>();
      for(int ast : asteroids){
        if(ast > 0){
            st.push(ast);
        }
        else{
            //ast <0
            //directly insert kardo stack me No addition check
            //addition check needed value compare,explord
            if(st.isEmpty()){
                st.push(ast);
            }
            else if(!st.isEmpty() && st.peek() < 0){
                st.push(ast);
            }

            else{
                //1st empty -> +ve -> st.pop()
                //2st empty -> -ve -> ast

                boolean destoryed = false;
                while(!st.isEmpty() && ast < 0 && st.peek() > 0){
                    if(st.peek() <-ast){
                        st.pop();
                        continue;
                    }
                    else if (st.peek() > -ast){
                     //ast destore hojaege
                     //no need to insert in Stack
                     destoryed = true;
                     //no need to check other element in stack
                     break;
                    }
                    else{
                         // st.pop() -> -ast
                         //dono ast exploted hogaege
                         st.pop();
                         destoryed = true;
                         break;

                    }
                }
                if(destoryed == false){
                    st.push(ast);
                }
            }
        }

      }
      int [] ans  = new int [st.size()];
      for(int i = st.size()-1; i >=0; i--){
        ans[i] = st.pop();
      } 
      return ans;
    }
}