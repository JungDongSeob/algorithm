class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str_a = String.valueOf(a);
        String str_b = String.valueOf(b);
        String str_result1 = str_a + str_b;
        String str_result2 = str_b + str_a;
        int int_result1 = Integer.valueOf(str_result1);
        int int_result2 = Integer.valueOf(str_result2);
        if (int_result1 >= int_result2)
            answer = int_result1;
        else
            answer = int_result2;
        return answer;
    }
}