import java.util.List;
import java.util.ArrayList;
import java.lang.Math.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List list = new ArrayList<>();
        
        while((n/3)!=0){
            list.add(n%3);
            // System.out.print(n%3);
            n = n/3;
        }
        // System.out.println(n);
        list.add(n);
        int level = 0;
        int num = 0;
        int sum = 0;
        for(int i = list.size()-1; i>= 0; i--){
        //     for(int j=0; j<=level; j++){
        //         num = 3 ** j;
        //     }
            sum = sum + (int)Math.pow(3,level) * (int)list.get(i);
            level++; 
            System.out.println(sum);
        }
        answer = sum;
        return answer;
    }
}