class Solution {
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int transform = 0;
        
        while(!s.equals("1")){
            int len = s.length();
            s = s.replace("0", "");
            
            int newlen = s.length();
            zero = zero + len - newlen;
            s = String.valueOf(Integer.toBinaryString(newlen));
            
            transform++;
            
        }
        
        answer[0] = transform;
        answer[1] = zero;
        
        return answer;
    }
}