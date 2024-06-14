
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] input = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i<babbling.length; i++){
            int cnt = 0;
            for(int j = 0; j<input.length; j++){
                if(babbling[i].contains(input[j]+input[j])){
                    break;
                }else{
                    String tmp = babbling[i];
                    int a = (tmp.length() - babbling[i].replace(input[j], "").length())/input[j].length();
                    babbling[i] = babbling[i].replace(input[j], "0");
                    
                    cnt = cnt + a;
                    System.out.println(babbling[i]);
                }
            }
            System.out.println(cnt);
            System.out.println(babbling[i].length());
            if(babbling[i].length() == cnt){
                answer++;
            }
        }


        return answer;

    }

}
