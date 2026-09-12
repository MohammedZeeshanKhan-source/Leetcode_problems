class Solution {
    public int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new int [0][0];
        }
        // for origial array
        int totalrow = matrix.length;
        int totalcol = matrix[0].length;
      
      //for new array
      int newtotalrow = totalcol;
      int newtotalcol = totalrow;

      int ans[][] = new int[newtotalrow][newtotalcol];

      //actual logic 
      for(int i = 0 ; i<totalrow; i++){
        for(int j = 0 ; j<totalcol; j++){
            ans[j][i] = matrix[i][j];
        }
      }

     return ans;
    
    }
}