
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> mapA = new HashMap<>();
        HashMap<Integer, String> mapB = new HashMap<>();
        int i = 1;
    
        for(String ns : players){
            mapA.put(ns, i);
            mapB.put(i, ns);
            i++;
        }
        
        for(String ns : callings){
            int tmp = mapA.get(ns);     // 원래 등수
            String str = mapB.get(tmp - 1); // 앞 선수
            mapA.put(ns,tmp -1);
            mapA.put(str,tmp);
            mapB.put(tmp - 1, ns);
            mapB.put(tmp, str);
        }
        
        for(int j = 0; j < players.length; j++){
            answer[j] = mapB.get(j+1);
        }
        
        return answer;
    }
}