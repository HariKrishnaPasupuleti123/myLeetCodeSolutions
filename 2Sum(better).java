class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
       int ele=nums[i];
       int sum=target-ele;
       if(map.containsKey(sum)){
        return new int[]{map.get(sum),i};
       }
       map.put(ele,i);

       }
   
    return new int[]{-1,-1};
}
}
