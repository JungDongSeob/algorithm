import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> cache = new ArrayList<>();
                
        for(int i = 0; i < cities.length; i++){
            cities[i] = cities[i].toLowerCase();
            
            if(cache.contains(cities[i])){
                answer = answer + 1;
                cache.remove(cities[i]);
                cache.add(cities[i]);
            }else{
                answer = answer + 5;
                if(cacheSize != 0){
                    if(cache.size() == cacheSize) cache.remove(0);
                    cache.add(cities[i]);
                }
            }
        }
        
        return answer;
        
    }
}