class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // String []str = new String[s.length()];
        // str = s.split("");
        // for(int i =0;i<str.length;i++){
        //     System.out.println(str[i]);
        // }
        
        char[] sArr = s.toCharArray();
        
        for(int i=0; i<sArr.length; i++){
            if(sArr[i]>64||(sArr.length!=4&&sArr.length!=6)){
                answer = false;
            }
        }
        
        // for(int i=0; i<sArr.length; i++){
        //     System.out.println(sArr[i]);
        // }
        return answer;
    }
}