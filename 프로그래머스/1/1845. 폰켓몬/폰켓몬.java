import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        /*
        
        */
        
        HashSet<Integer> ponketmon = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            ponketmon.add(nums[i]);
        }
        System.out.println(ponketmon.size());
        if(nums.length/2 >ponketmon.size()){
            return ponketmon.size();
        }else{
            return nums.length/2;
        }
  
    }
}