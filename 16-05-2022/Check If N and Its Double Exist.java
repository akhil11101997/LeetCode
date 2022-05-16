class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Boolean> mapp=new HashMap<>();
        int i=0;
        while(i<arr.length){
            if(mapp.get(arr[i])==null){
                mapp.put(2*arr[i],true);
                if(arr[i]%2==0)
                    mapp.put(arr[i]/2,true);
            }
            else {
                return true;
            }
            i++;
        }
        return false;
    }
}
