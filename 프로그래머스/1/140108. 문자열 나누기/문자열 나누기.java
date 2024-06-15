import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        HashMap<Character, Integer> a = new HashMap<>();
        HashMap<Character, Integer> b = new HashMap<>();
        int len = s.length();
        char chr = ' ';

        
        for(int i = 0; i < len; i++){
            if(a.size()==0){
                chr = s.charAt(i);
                a.put(s.charAt(i),1);
            }else{
                if(chr == s.charAt(i)){
                    a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
                }else{
                    b.put(chr,b.getOrDefault(chr,0)+1);
                }
            }
            
            if(a.equals(b) || i == len-1){
                answer++;
                a.clear();
                b.clear();
            }
            
        }
        /*
        맵 2개 생성
        첫글자 변수에 넣고 맵에도 넣기
        다음 글자가 변수와 같으면 맵에 넣고
        다르면 다른 맵에 넣고
        두 개의 맵이 같은지 검사
        같으면 분리
        다르면 진행
        */
        
        return answer;
    }
}