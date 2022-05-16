class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res=new int[nums.length];
        int i=0,j=nums.length-1;
        for(int a=0;a<nums.length;a++){
            if(nums[a]%2==0){
                res[i]=nums[a];
                i++;
            }
            else {
                res[j]=nums[a];
                j--;
            }
        }
        return res;
    }
}
