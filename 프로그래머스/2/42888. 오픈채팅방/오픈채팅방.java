import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        String[][] info = new String[record.length][];
        List<String> answerList = new ArrayList<>();
        
        for(int i = 0; i < record.length; i++){
            info[i] = record[i].split(" ");
            if(info[i][0].equals("Enter") || info[i][0].equals("Change")){
                map.put(info[i][1],info[i][2]);
            }
        }
        
        for(int i = 0; i < info.length; i++){
            if(info[i][0].equals("Enter")){
                answerList.add(map.get(info[i][1]) + "님이 들어왔습니다.");
            }else if(info[i][0].equals("Leave")){
                answerList.add(map.get(info[i][1]) + "님이 나갔습니다.");
            }
        }
        
        String[] answer = answerList.toArray(new String[0]);

        
        return answer;
    }
}