class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2  = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && el2!=nums[i]){
                el1 = nums[i];
                count1=1;
            }
            else if(count2==0 && el1!=nums[i]){
                el2 = nums[i];
                count2=1;
            }
            else if(count1!=0 && el1==nums[i]){
                count1++;
            }
            else if(count2!=0 && el2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]){
                count1++;
            }
            else if(el2==nums[i]&&el2!=el1){
                count2++;
            }
        }
        if(count1>n/3){
            lst.add(el1);
        }
        if(count2>n/3){
            lst.add(el2);
        }
        return lst;
    }
}