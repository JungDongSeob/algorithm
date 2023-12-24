import java.util.*;

class Solution {
    public Integer[] solution(int[] arr) {
        int[] answer;
        int tmp = 0;
        int min = 0;
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        
        if(arr.length==1){
            list.add(-1);
        }else{
            for(int i=0; i<arr.length; i++){
                list.add(arr[i]);
            }
            min = arr[0];
            for(int i=1; i<arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                    idx = i;
                }
            }
            list.remove(idx);
        }
        
        // for(int i=0;i<arr.size-1; i++){
        //     arr[i]=list[i];
        // }
//         if(arr.size>=2){
//             min = arr[0];
//             for(int i=1; i<arr.size; i++){
//                 if(min > arr[i]){
//                     min = arr[i];
//                     idx = i;
//                 }
//             }
            
            
//             for(int i = 1; i < arr.size; i++) {
//                 for(int j = 0; j < arr.size - i; j++) {
//                     if(a[j] > a [j + 1]) {
//                         tmp = a[j];
//                         a[j] = a[j+1];
//                         a[j+1] = tmp;
//                     }
//                 }
//             }
//         }else{
//             answer = {-1}
//         }
       Integer newArr[] = list.toArray(new Integer[list.size()]);
        
        return newArr;
    }
}