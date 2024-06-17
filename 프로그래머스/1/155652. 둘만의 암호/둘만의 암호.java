class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int cnt;
        boolean flag = false;
        for(int i = 0; i <s.length(); i++){
            int chr = s.charAt(i) - 97;
            for(int j = 0; j < index; j++){
                if(!flag){
                    chr = (chr + 1) % 26;    
                }
                if(skip.contains(""+(char)(chr + 97))){
                    chr = (chr + 1) % 26;
                    System.out.println("드감");
                    j--;
                    flag = true;
                }else{
                    flag = false;
                }
            }
            answer = answer + (char)(chr+ 97);
        }
        /*
        index길이만큼 반복문
            a-97/26 이 skip에 속해있나
                있다면 a+1 하고 i--
                없다면
        answer에 더하기
        */
        
        return answer;
    }
}