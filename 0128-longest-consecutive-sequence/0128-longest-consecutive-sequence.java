class Solution {
    public int longestConsecutive(int[] nums) {
       int max = 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            
        }
        for(int i=0;i<nums.length;i++){
        int count = 1;
            int num = nums[i];
            
            //loook left
            while(set.contains(--num)){
                count++;
                set.remove(num);
            }
            
            //look right
            num = nums[i];
            while(set.contains(++num)){
                count++;
                set.remove(num);
            }
            max = Math.max(max,count);
        }
        return max;
    }
}