import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        
        // Integer[] newArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);
        
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(newArray[i]);    
        // }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
           
        if(list.size()==0){
            int[] answer = {-1};
            return answer;
        }else{
            
            int[] answer = new int[list.size()];
            
            for(int i=0; i<list.size(); i++){
                answer[i]=list.get(i).intValue();
            }
            return answer;
        }
        
        // for(int i=0; i<answer.size; i++){
        //     System.out.println(answer[i]);    
        // }
        
      
    }
}