import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = discount.length - 9;
        Map<String, Integer> mapA = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            mapA.put(want[i], number[i]);
        }
        
        for(int i = 0; i <= discount.length - 10; i++){
            Map<String, Integer> mapB = new HashMap<>();
            for(int j = i; j < 10+i; j++){
                mapB.put(discount[j],mapB.getOrDefault(discount[j],0)+1);
            }
            
            

            for(String str : mapB.keySet()){
                if(mapA.getOrDefault(str,0) != mapB.get(str)){
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}