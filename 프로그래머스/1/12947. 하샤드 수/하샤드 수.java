class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        int result = x;
        
        
        while(true){
            num = num + x%10;
            x = x/10;
            if(x==0)
                break;
        }
        
        if(result%num != 0)
            answer = false;
        
        return answer;
    }
}