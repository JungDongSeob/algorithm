class Solution {
    public String solution(String s, int n) {
        String answer = "";
        

        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(chr >= 65 && chr <= 90){
                chr = (char)((chr - 65 + n)%26 + 65);
                answer = answer + String.valueOf(chr);
            }else if( chr >= 97 && chr <= 122){
                chr = (char)((chr - 97 + n)%26 + 97);
                answer = answer + String.valueOf(chr);
            }else{
                answer = answer + String.valueOf(chr);
            }
        }
        
        return answer;
    }
}