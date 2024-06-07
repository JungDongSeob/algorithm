class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        if(n<a){
            return 0;
        }else{
            int tmp = n%a;
            int full = n/a*b;
            return full + solution(a,b,tmp+full);
        }
        
        
    }
}