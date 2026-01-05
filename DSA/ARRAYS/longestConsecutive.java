class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            set.add(value);
        }

        int longest = 0;
        Integer[] values = set.toArray(new Integer[0]);
        for(int i=0;i<values.length;i++){
            int value = values[i];
            if(!set.contains(value-1)){
                int count = 1;
                int current = value;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                if(count>longest){
                    longest = count;
                }
            }
        }
        return longest;
    }
}