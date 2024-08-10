

class Solution {
    public int solution(int n, int k) {
        int answer = -1;
        
        StringBuilder sb = new StringBuilder();
        
        while(n!=0){
            sb.append(n%k);
            n = n / k;
        }
        
        sb.reverse();
        String numN = sb.toString();
        System.out.println(numN);
        numN = numN.replaceAll("0{2,}","0");
        String[] nums = numN.split("0");
        answer = nums.length;
        
        for(int i = 0; i < nums.length; i++){

            long num = Long.parseLong(nums[i]);
            
            if(num == 1){
                answer--;
            }else{
                for(int j = 2; j <= Math.sqrt(num); j++){
                    if(num%j == 0){
                        answer--;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}