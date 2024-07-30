import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = 0;
        int kind = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
        }
        
        List<Integer> al = new ArrayList<>(map.keySet());
        
        Collections.sort(al, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        for(Integer ni : al){
            count = count + map.get(ni);
            kind = kind + 1;
            if(count >= k){
                break;
            }
        }
        
        return kind;
    }
}