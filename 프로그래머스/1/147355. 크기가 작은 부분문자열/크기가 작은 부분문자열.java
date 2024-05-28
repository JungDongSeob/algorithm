

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        char[] tArr = t.toCharArray();
        int size = p.length();
        String str = "";
        Long a = 0L;
        Long b = Long.parseLong(p);

        
        for(int i = 0; i <= (tArr.length-size); i++){
            for(int j = i; j < i + size; j++){
                str = str + tArr[j];
            }
            a = Long.parseLong(str);
            // System.out.println(a);
            if(a <= b){
                answer++;
            }
            
            str = "";
        }
        
        return answer;
    }
}