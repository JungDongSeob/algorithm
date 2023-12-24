class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer(s);
        
        if(sb.length()%2==0){
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else{
            answer = s.substring(s.length()/2,s.length()/2+1);
        }
        System.out.println(answer);
        
        return answer;
    }
}