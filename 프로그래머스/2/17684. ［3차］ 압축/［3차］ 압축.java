import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String msg) {
        
        String[] alpha = {"A","B","C","D","E",
                          "F","G","H","I","J",
                          "K","L","M","N","O",
                          "P","Q","R","S","T",
                          "U","V","W","X","Y","Z"};
        
        Map<String, Integer> map = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        String currentWord = "";
        String nextWord = "";
        int idx = 0;
        
        msg = msg + " ";
        
        for(int i = 1; i <= alpha.length; i++){
            map.put(alpha[i-1], i);
        }

        while(!nextWord.equals(" ")){
            currentWord = "" + msg.charAt(idx);
            nextWord = "" + msg.charAt(idx + 1);
            
            while(!nextWord.equals(" ")){
                if(map.containsKey(currentWord + nextWord)){
                    idx++;
                    currentWord = currentWord + nextWord;
                    nextWord = "" + msg.charAt(idx + 1);
                }else{
                    idx++;
                    map.put(currentWord + nextWord, map.size()+1);
                    break;
                }
            }
            al.add(map.get(currentWord));
        }

        int[] answer = al.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}