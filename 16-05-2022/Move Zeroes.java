class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[j]=nums[i];
                if(j!=i)
                    nums[i]=0;
                j++;
            }
            i++;
        }
    }
}
