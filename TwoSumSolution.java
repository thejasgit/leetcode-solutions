public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> remainder = new HashMap<Integer,Integer>();
        int [] result = new int[2];
        
        for(int i=0; i<nums.length;i++){
            int searchkey = target-nums[i];
            if(remainder.containsKey(searchkey)){
                int index = remainder.get(searchkey);
                if(i<index){
                    result[0]=i;
                    result[1]=index;
                }else {
                    result[0]=index;
                    result[1]=i;
                }
                
                return result;
            }else
            remainder.put(nums[i],i);
            
        }
        return null;
    }
}