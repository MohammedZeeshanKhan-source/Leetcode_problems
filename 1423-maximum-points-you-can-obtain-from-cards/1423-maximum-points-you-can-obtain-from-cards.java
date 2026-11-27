class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int leftsum =0;
     int rigthsum = 0;
     int totalsum = 0;

     for(int i =0; i<k; i++){
        leftsum =leftsum + cardPoints[i];
     }
     int maxsum =leftsum;
     int rightIndex = cardPoints.length -1;

     for(int i=k-1; i>=0; i--){
        leftsum = leftsum - cardPoints[i];
        rigthsum = rigthsum + cardPoints[rightIndex];
        totalsum = leftsum + rigthsum;
        maxsum = Math.max(maxsum , totalsum);
        rightIndex--;
     }  
     return maxsum;
    }
}