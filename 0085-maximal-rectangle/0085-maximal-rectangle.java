class Solution {
public static void findprevioussmallestIndex(int heights[],int prev[]){
   Deque<Integer> st = new ArrayDeque<>();
   //next smaller -> right to left
   //prev smaller -> left to rigth
   for(int i=0; i<heights.length; i++){
    //useless element pop 
    int currIndex = i;
    while(!st.isEmpty() && heights[st.peek()] >= heights[currIndex]){
        st.pop();
    }
    if(st.isEmpty()){
        prev[i] = -1;
    } 
    else{
       prev[i] = st.peek();
    }
    st.push(currIndex);
   }
    }

public static void findnextsmallestIndex(int heights[],int next[]){
  Deque<Integer> st = new ArrayDeque<>();
  int n =heights.length;
   //next smaller -> right to left
   //prev smaller -> left to rigth
   for(int i=heights.length-1; i>=0 ; i--){
    //useless element pop 
    int currIndex = i;
    while(!st.isEmpty() && heights[st.peek()] >= heights[currIndex]){
        st.pop();
    }
    if(st.isEmpty()){
        next[i] = n;
    } 
    else{
       next[i] = st.peek();
    }
    st.push(currIndex);
   }
    }
public int largestRectangleArea(int[] heights) {
        int prev[] = new int [heights.length];
        int next[] = new int [heights.length];

        findprevioussmallestIndex(heights,prev);
        findnextsmallestIndex(heights,next);

        int maxarea = -1;
        for(int i =0; i<heights.length;i++){
            int height = heights[i];
            int width = next[i] - prev[i] -1;
            int area = height * width;

            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }

public int maximalRectangle(char[][] matrix) {

    int rows =  matrix.length;     
    int cols = matrix[0].length;

    //main iss 2D  problem ko 1D me convert krunga
    int[] height = new int[cols];

    int maxarea = -1;


   for(int i=0; i<rows; i++){
       for(int j=0; j<cols; j++){
           if(matrix[i][j] == '1'){
                 height[j]++;
           }
           else{
            height[j] =0;
           }        
       }


       int area =largestRectangleArea(height);
         maxarea = Math.max(maxarea, area);
   }

   return maxarea;
    }
}