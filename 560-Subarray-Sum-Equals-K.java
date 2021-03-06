class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<> ();
        map.put(0,1);
        int sum=0;
        int res=0;
        for(int num:nums){
            sum+=num;
            int target=sum-k;
            res+=map.getOrDefault(target,0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        
        }
        return res;
    }
    
}
