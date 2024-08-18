import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int feeSolve(int time, int[] fees){
        int result = 0;
        if(time < fees[0]){
            result = fees[1];
        }else{
            result = fees[1] + (int)Math.ceil((time - fees[0])/(double)fees[2])*fees[3];
        }
        return result;
    }
    public int timeSolve(String[] timeIN, String[] timeOUT){
        int hour = Integer.parseInt(timeOUT[0]) - Integer.parseInt(timeIN[0]);
        int min = 0;
        if(Integer.parseInt(timeIN[1])> Integer.parseInt(timeOUT[1])){
            hour = hour - 1;
            min = Integer.parseInt(timeOUT[1]) - Integer.parseInt(timeIN[1]) + 60;
        }else{
            min = Integer.parseInt(timeOUT[1]) - Integer.parseInt(timeIN[1]);
        }
        return hour*60 + min;
    }
    public int[] solution(int[] fees, String[] records) {
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> timeMap = new HashMap<>();
        Map<String, Integer> fee = new HashMap<>();
        for(String str : records){
            String[] info = str.split(" ");
            
            if(info[2].equals("IN")){
                map.put(info[1],info[0]);
                fee.put(info[1], fee.getOrDefault(info[1],0));
            }else{
                String[] timeIN = map.get(info[1]).split(":");
                String[] timeOUT = info[0].split(":");
                int time = timeSolve(timeIN, timeOUT);
                timeMap.put(info[1], timeMap.getOrDefault(info[1], 0) + time);
                map.remove(info[1]);
            }
        }
        
        for(String str : map.keySet()){
            String[] timeIN = map.get(str).split(":");
            String[] timeOUT = "23:59".split(":");
            int time = timeSolve(timeIN, timeOUT);
            timeMap.put(str, timeMap.getOrDefault(str,0) + time);
        }
        

        List<String> keySet = new ArrayList<>(timeMap.keySet());
        Collections.sort(keySet);
        int[] answer = new int[keySet.size()];
        
        for(int i=0; i < keySet.size(); i++){
            int time = timeMap.get(keySet.get(i));
            answer[i] = feeSolve(time, fees);
        }
        return answer;
    }
}