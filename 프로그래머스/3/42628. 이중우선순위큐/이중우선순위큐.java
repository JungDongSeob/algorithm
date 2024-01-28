import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        int tmp = 0;
        /*
        우선순위 큐 선언
        문자열 처리
        split해서 
        newArr[0].substring(0,1)==i면
        Integer.valueOf(newArr[1])
        D면
            size!=0 아니라면
                newArr[1]=1이면 최댓값뽑기
                newArr[1]=-1이면 최솟값뽑기
        
        operations 길이만큼 수행하고 큐가 비어있으면 [0,0]
        비어있지않으면 ~
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> subpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<operations.length; i++){
            String[] newStr = operations[i].split(" ");
            // for(int j=0; j<newStr.length; j++){
            //     System.out.print("스플릿" + newStr[j]);
            // }
            // System.out.println();
            if(newStr[0].equals("I")){
                // Integer.valueOf(newStr[1]);
                pq.add(Integer.valueOf(newStr[1]));
                subpq.add(Integer.valueOf(newStr[1]));
                // System.out.println(newStr[1]);
            }else if(newStr[0].equals("D")){
                if(pq.size()!=0){
                    if(Integer.valueOf(newStr[1])==-1){     //최솟값
                        pq.poll();
                    }else{                                  //최댓값
                        tmp = subpq.poll();
                        
                        pq.remove(tmp);
                    }
                }
            }
            
        }
        
        if(pq.size()==0){
            return answer;
        }else{
            answer[1]=pq.poll();
            tmp = subpq.poll();
            answer[0]=tmp;
        }
        return answer;
    }
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // pq.add(-10);
        // pq.add(-5);
        // pq.add(13);
        // pq.add(17);
        // int a = pq.remove(-5);
        // System.out.println(a);
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

}