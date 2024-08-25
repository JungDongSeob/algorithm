import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] numberString = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            numberString[i] = "" + numbers[i];
        }
        
        Arrays.sort(numberString, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        for(int i = 0; i < numbers.length; i++){
            answer = answer + numberString[i];
            if(answer.equals("00")) answer = "0";
        }
        return answer;
    }
}