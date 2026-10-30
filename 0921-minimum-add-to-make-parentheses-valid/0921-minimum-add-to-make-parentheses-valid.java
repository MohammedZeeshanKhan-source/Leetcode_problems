class Solution {
    public int minAddToMakeValid(String s) {
          int opening  =0;
          int addition  = 0;

          for(char ch : s.toCharArray()){
            if(ch == '('){
                opening ++;
            }
            else{
                //ch ==')'

                if(opening >0){
                    opening --;
                }
                else{
                    addition ++;
                }
            }
          }
        int finalAns = addition + opening;
        return finalAns;



















    //     Deque<Character> st = new ArrayDeque<>();
    //    int addition =0;
    //     for(char ch : s.toCharArray()){
    //         //openaing bracket
    //         if(ch =='('){
    //             st.push(ch);
    //         }
    //         else{
    //             //ch = ')'
    //             //toh mujhe is closing bracket k liye stacks ek opening bracket ko canla outkrna hoge 
    //             if(st.isEmpty()){
    //                 addition++;
    //             }
    //             else{
    //                 st.pop();
    //             }
    //         }
    //     }
    //     //final answer kis kis se banege -> addition ,st.size();
    //     int finalans = addition + st.size();

    //     return finalans;
    }
}