/*Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?*/
public class Solution {
    public int[] singleNumber(int[] nums) {
        int len = nums.length;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }
        
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(Integer key : map.keySet()){
            resultList.add(key);
        }
        
        int resultLen = resultList.size();
        int[] result = new int[resultLen];
        
        for(int j=0;j<resultLen;j++){
            result[j]=resultList.get(j);
        }
        
        return result;
        
    }
}
