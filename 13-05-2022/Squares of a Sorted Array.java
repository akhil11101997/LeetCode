class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        while(i<nums.length && nums[i]<0){
            i++;
        }
        int j=i-1;
        int res[]=new int[nums.length];
        int c=0;
        while(j>=0 && i<nums.length){
            if(nums[i]>Math.abs(nums[j])){
                res[c]=nums[j]*nums[j];
                j--;
                c++;
            }
            else {
                res[c]=nums[i]*nums[i];
                i++;
                c++;
            }
        }
        while(j>=0){
            res[c]=nums[j]*nums[j];
            j--;
            c++;
        }
        while(i<nums.length){
            res[c]=nums[i]*nums[i];
            i++;
            c++;
        }
        return res;
    }
}
