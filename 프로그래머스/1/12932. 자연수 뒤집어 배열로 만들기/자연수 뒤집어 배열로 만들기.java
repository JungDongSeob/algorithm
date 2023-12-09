class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int x = 1;
        String strNumber1 = String.valueOf(n);
        String[] strNumber2 = strNumber1.split("");
        String[] strNumber3 = new String[strNumber2.length];
        answer = new int[strNumber2.length];
        
        for(int i=0; i<strNumber2.length; i=i+1){
            strNumber3[i] = strNumber2[strNumber2.length-i-1];
            answer[i] = Integer.valueOf(strNumber3[i]);
        }
        
        //System.out.print(n.length());
        
        return answer;
    }
}