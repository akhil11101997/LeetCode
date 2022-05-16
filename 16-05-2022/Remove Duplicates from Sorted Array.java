class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            while(i+1<nums.length && nums[i+1]==nums[i]){
                i++;
            }
            nums[j]=nums[i];
            i++;
            j++;
        }
        return j;
    }
}
