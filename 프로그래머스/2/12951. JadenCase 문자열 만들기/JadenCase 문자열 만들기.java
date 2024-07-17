class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int sub = s.length() - s.replaceAll("\\s+$", "").length();
        
        String[] str = s.split(" ");
        
        for(String string : str){
            string = string.toLowerCase();
            // System.out.println(string);
            if(string.length() > 0 && string.charAt(0) >= 97 && string.charAt(0) <= 122){
                sb.append(string);
                sb.delete(0, 1);
                sb.insert(0, (char)(string.charAt(0) - 32));
                answer = answer + sb.toString() + " ";
                sb.delete(0, sb.length());  
            }else{
                answer = answer + string + " ";
            }
            
        
        }
        
        for(int i = 0; i < sub; i++){
            answer = answer + " ";
        }
        
        return answer.substring(0,answer.length()-1);

    }
}