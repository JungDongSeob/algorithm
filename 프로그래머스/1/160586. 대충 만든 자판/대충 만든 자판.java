class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int max = 0;
        int keynum;
        
        for(int i = 0; i < keymap.length; i++){
            if(max < keymap[i].length()){
                max = keymap[i].length();
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            
            for(int l = 0; l < targets[i].length(); l++){
                keynum = 0;
                for(int j = 0; j < max; j++){
                    
                    for(int k = 0; k < keymap.length; k++){
                        
                        if(j < keymap[k].length() && keymap[k].charAt(j) == targets[i].charAt(l)){
                            System.out.print(keymap[k].charAt(j) + " ");
                            keynum = j+1;
                        }
                        
                    }
                    
                    if(keynum > 0){
                        break;
                    }
                }
                if(keynum == 0){
                    answer[i] = -1;
                    break;
                }else{
                    answer[i] = answer[i] + keynum;
                }
            }
        }

        
        return answer;
    }
}