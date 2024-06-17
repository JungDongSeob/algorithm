import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++){
            if(max < keymap[i].length()){
                max = keymap[i].length();
            }
        }
        
        for(int i = 0; i < max; i++){
            for(int j = 0; j < keymap.length; j++){
                if(i < keymap[j].length() && !map.containsKey(keymap[j].charAt(i))){
                    map.put(keymap[j].charAt(i), i+1);
                }
            }
        }
        for(Character nc : map.keySet()){
            System.out.print(nc + " ");
        }
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                if(map.containsKey(targets[i].charAt(j))){
                    answer[i] = answer[i] + map.get(targets[i].charAt(j));
                }else{
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}