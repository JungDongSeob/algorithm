import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int[] newArray = new int[elements.length*2];


        
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        System.arraycopy(elements, 0, newArray, elements.length, elements.length);
        
        
        for(int i = 1; i <= elements.length; i++){
            int lt = 0;
            int rt = i;
            int num = 0;
            for(int j = 0; j < rt; j++){
                num = num + elements[j];
            }
            while(rt != newArray.length){
                set.add(num);
                num = num - newArray[lt];
                num = num + newArray[rt];
                lt++;
                rt++;
            }
        }

        answer = set.size();

        return answer;
    }
}