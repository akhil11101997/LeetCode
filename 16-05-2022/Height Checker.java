class Solution {
    public int heightChecker(int[] heights) {
        int[] res=new int[heights.length];
        for(int i=0;i<res.length;i++){
            res[i]=heights[i];
        }
        for(int i=1;i<heights.length;i++){
            if(res[i]<res[i-1]) {
                int replace=res[i];
                int j=i;
                while(j-1>=0 && replace<res[j-1]){
                    res[j]=res[j-1];
                    j--;
                }
                res[j]=replace;
            }
        }
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i]!=heights[i])
                count++;
        }
        return count;
        
    }
}
