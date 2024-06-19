import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuilder;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        
        for(Character ns : X.toCharArray()){
            mapA.put(ns, mapA.getOrDefault(ns,0)+1);    
        }
        
        for(Character ns : Y.toCharArray()){
            if(mapA.containsKey(ns) && mapA.get(ns) != 0){
                mapA.put(ns,mapA.get(ns)-1);
                mapB.put(ns,mapB.getOrDefault(ns,0)+1);
            }
        }
        List<Character> al = new ArrayList<>(mapB.keySet());
        Collections.sort(al, Collections.reverseOrder());
        
        for(Character nc : al){
            int len = mapB.get(nc);
            if(sb.toString().equals("") && nc == '0'){
                len = 1;
            }
            for(int i = 0; i < len; i++){
                sb.append(nc);
            }
        }
        
        if(sb.toString().equals("")){
            sb.append("-1");
        }
        answer = sb.toString();
        return answer;
    }
}