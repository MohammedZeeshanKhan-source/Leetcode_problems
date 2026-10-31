class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){

            if(!st.isEmpty()){
                //equal
                    if(st.peek() == ch){
                        //remove duplicates
                      st.pop();
                    }

                    else{
                        //not equal
                        st.push(ch);
            }
            }
            else{
                st.push(ch);
            }
        }
        //stacks agar empty toh return empty as answer 
        //non empty h tohh create a string using stacks element 
        //and reverse and return is an answer
        StringBuilder str = new StringBuilder();
        while(! st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }

        return str.reverse().toString();
    }
}