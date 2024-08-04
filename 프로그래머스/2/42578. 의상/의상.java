import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> cloth = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            cloth.put(clothes[i][1], cloth.getOrDefault(clothes[i][1], 0)+1);
        }
        
        for(String str : cloth.keySet()){
            answer = answer * (cloth.get(str)+1);
        }
        
        answer = answer - 1;
        return answer;
    }
}