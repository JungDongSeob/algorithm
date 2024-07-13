import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        String[] NonDupliReport = reportSet.toArray(new String[0]);
        String[][] splitReport = new String[NonDupliReport.length][];
        
        Map<String, Integer> reportMap = new HashMap<>();
        Map<String, Integer> listMap = new HashMap<>();
        

        for(int i = 0; i < NonDupliReport.length; i++){
            splitReport[i] = NonDupliReport[i].split(" ");
            reportMap.put(splitReport[i][1], reportMap.getOrDefault(splitReport[i][1],0)+1);
        }
        
        for(int i = 0; i < splitReport.length; i++){
            if(reportMap.get(splitReport[i][1]) >= k){
                listMap.put(splitReport[i][0], listMap.getOrDefault(splitReport[i][0], 0)+1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = listMap.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
    /**
    set으로 report 정리
    set to array > NonDupliReport를 split하고
    reportmap으로 report[i][1] 횟수세기
    listmap만들고
    NonDupliReport[i][0]이 reportmap에서  NonDupliReport[i][1] 가 k이상이면 listmap 1추가
    */
}