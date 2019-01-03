class Solution {
    int [] nums;
    Random rnd;
    public Solution(int[] nums) {
        this.nums=nums;
        this.rnd=new Random();
    }
    
    public int pick(int target) {
        int res=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target)
                continue;
            if(rnd.nextInt(++count)==0)
                res=i;
        }
        return res;
    }
}
