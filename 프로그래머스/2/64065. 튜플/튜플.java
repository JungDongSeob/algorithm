import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        int[] answer;
        String[] arr;
        List<String> al = new ArrayList<>();
        String[] arrString;
        
        s = s.substring(2, s.length()-2);
        arr = s.split("\\}\\,\\{");
        
        Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());
        
        for(String str : arr){
            arrString = str.split(",");
            for(String string : arrString){
                if(!al.contains(string)){
                    al.add(string);
                }
            }
        }
        
        answer = new int[al.size()];
        
        for(int i = 0; i < al.size(); i++){
            answer[i] = Integer.valueOf(al.get(i));
        }
        
        return answer;
    }
}