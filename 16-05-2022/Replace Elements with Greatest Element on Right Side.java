class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res=new int[arr.length];
        res[arr.length-1]=-1;
        int maxi=-1;
        for(int i=arr.length-2;i>=0;i--){
            res[i]=Math.max(maxi,arr[i+1]);
            maxi=res[i];
        }
        return res;
    }
}
