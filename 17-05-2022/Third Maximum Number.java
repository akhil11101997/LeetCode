class Solution {
    public int thirdMax(int[] nums) {
        int[] res= new int[3];
        int i=0;
        int j=0;
        while(i<nums.length && j<3){
            while(i+1<nums.length && nums[i+1]==nums[i]){
                i++;
            }
            if(j==0) {
                res[j]=nums[i];
                j++;
            }
            if(j==1){
                if(res[0]!=nums[i]) {
                    res[j]=nums[i];
                    j++;
                }
            }
            if(j==2) {
                if(res[0]!=nums[i] && res[1]!=nums[i]){
                    res[j]=nums[i];
                    j++;
                }
            }
            i++;
        }
        if(j!=3) {
            int maxi=Integer.MIN_VALUE;
            for(i=0;i<=j;i++){
                maxi=Math.max(maxi,res[i]);
            }
            return maxi;
        }
        int maxi=Math.max(res[0],res[1]);
        maxi=Math.max(maxi,res[2]);
        int mini=Math.min(res[0],res[1]);
        mini=Math.min(mini,res[2]);
        res[1]=res[0]+res[1]+res[2]-maxi-mini;
        res[0]=maxi;
        res[2]=mini;
        for(int a=i;a<nums.length;a++){
            if(nums[a]>res[2] && nums[a]!=res[0] && nums[a]!=res[1]){
                res[2]=nums[a];
                if(res[1]<res[2]){
                    int temp=res[2];
                    res[2]=res[1];
                    res[1]=temp;
                }
                if(res[0]<res[1]){
                    int temp=res[1];
                    res[1]=res[0];
                    res[0]=temp;
                }
            }
        }
        return res[2];
    }
}
