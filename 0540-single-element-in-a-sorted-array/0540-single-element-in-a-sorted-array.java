class Solution {
    public int singleNonDuplicate(int[] nums) {
        int Xorsum = 0;

        for(int i : nums){
            Xorsum = Xorsum ^ i;
        }

        return Xorsum;
    }
}