class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res=new int[arr.length];
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[i]!=0) {
                res[j]=arr[i];
                j++;
                i++;
            }
            else {
                res[j]=0;
                if(j+1<arr.length) 
                    res[j+1]=0;
                j=j+2;
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
        return;
    }
}
