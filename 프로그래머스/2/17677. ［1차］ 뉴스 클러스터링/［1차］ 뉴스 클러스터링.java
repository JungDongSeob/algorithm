import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int intersection = 0;
        int union = 0;
        str1 = str1 + " ";
        str2 = str2 + " ";
        Map<String, Integer> string1 = new HashMap<>();
        Map<String, Integer> string2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = str1.replaceAll("[^a-zA-Z]"," ");
        str2 = str2.replaceAll("[^a-zA-Z]"," ");

        
        for(int i = 0; i < str1.length()-2; i++){
            String part1 = str1.substring(i, i+2);

            if(!part1.contains(" ")){
                string1.put(part1, string1.getOrDefault(part1,0)+1);
                set.add(part1);
            }
        }
        
        for(int i = 0; i < str2.length()-2; i++){
            
            String part2 = str2.substring(i, i+2);

            if(!part2.contains(" ")){
                string2.put(part2, string2.getOrDefault(part2,0)+1);
                set.add(part2);
            }
        }
        
        
        for(String str : string1.keySet()){
            int num1 = string1.get(str);
            int num2 = string2.getOrDefault(str,0);
            
            if(num1<=num2){
                intersection += num1;
            }else{
                intersection += num2;
            }
        }
        
        for(String str : set){
            int num1 = string1.getOrDefault(str,0);
            int num2 = string2.getOrDefault(str,0);
            
            if(num1>=num2){
                union += num1;
            }else{
                union += num2;
            }
        }
        
        if(intersection == union){
            answer = 65536;
        }else{
            answer = (int)Math.floor(intersection / (float)union * 65536);
        }
        return answer;
    }
}