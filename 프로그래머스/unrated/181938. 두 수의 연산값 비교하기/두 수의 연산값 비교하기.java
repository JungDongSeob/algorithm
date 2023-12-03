class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int num_ab = Integer.parseInt(""+a+b);
        int num_2ab = 2 * a * b;
        
        if(num_ab >= num_2ab)
            answer = num_ab;
        else
            answer = num_2ab;
        
        return answer;
    }
}