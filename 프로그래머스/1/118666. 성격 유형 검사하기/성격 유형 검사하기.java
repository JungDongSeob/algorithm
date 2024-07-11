import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        String MBTI = "RTCFJMAN";
        
        for(int i = 0; i < MBTI.length(); i++){
            map.put(MBTI.charAt(i), 0);
        }
        
        for(int i = 0; i < survey.length; i++){
            int value = choices[i] - 4;
            if(value < 0){
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0))+Math.abs(value));
            }else{
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1))+Math.abs(value));
            }
        }
        
        for(int i = 0; i < MBTI.length(); i = i + 2){
            if(map.get(MBTI.charAt(i))>=map.get(MBTI.charAt(i+1))){
                answer = answer + MBTI.charAt(i);
            }else{
                answer = answer + MBTI.charAt(i+1);
            }
        }
        
        return answer;
    }
}