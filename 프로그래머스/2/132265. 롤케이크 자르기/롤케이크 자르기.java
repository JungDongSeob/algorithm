import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer,Integer> mapA = new HashMap<>();
        Map<Integer,Integer> mapB = new HashMap<>();
        
        for(int ni : topping){
            mapB.put(ni, mapB.getOrDefault(ni, 0)+1);
        }
        
        for(int ni : topping){
            mapA.put(ni, mapA.getOrDefault(ni, 0)+1);
            mapB.put(ni, mapB.getOrDefault(ni, 0)-1);
            if(mapB.get(ni) == 0){
                mapB.remove(ni);
            }
            if(mapA.size() == mapB.size()) answer++;
        }
        
        return answer;
    }
}