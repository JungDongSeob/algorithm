class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] numS = s.split(" ");
        
        for(int i = 0; i < numS.length; i++){
            if(max < Integer.parseInt(numS[i])){
                max = Integer.parseInt(numS[i]);
            }
            if(min > Integer.parseInt(numS[i])){
                min = Integer.parseInt(numS[i]);
            }
        }
        
        answer = min + " " + max;
        return answer;
    }
}