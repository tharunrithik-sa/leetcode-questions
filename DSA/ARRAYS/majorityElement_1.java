import java.util.*;
class majorityElement_1{
    public int majorityElement(int[]nums){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int value = nums[i];
        if(map.containsKey(value)){
            map.put(value,map.get(value)+1);
        }
        else{
            map.put(value,1);
        }
    }
    int n = nums.length;
    for(int i=0;i<n;i++){
        int value = nums[i];
        if(map.containsKey(value)){
            if(map.get(value)>n/2){
                return value;
            }
        }
    }
    return -1;
    }
}
    

