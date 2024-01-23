class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        int res[] = {0, 0};
        for(int i = 0; i<nums.length; ++i){
            int b = target - nums[i];

            if(memo.containsKey(b)){
                res[0] = i;
                res[1] = memo.get(b);
                return res;
            } 
                
            memo.put(nums[i], i);
        }
        return res;
    }
}