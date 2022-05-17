class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Boolean> mapp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mapp.get(nums[i])==null){
                mapp.put(nums[i],true);
            }
        }
        List<Integer> listt=new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){
            if(mapp.get(i)==null){
                listt.add(i);
            }
        }
        return listt;
    }
}
