import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        /*
        실행 대기 큐 > 꺼냄
        대기 중인 큐의 우선순위가 방금 꺼낸거 보다 높으면 방금 꺼낸거 다시 넣음
        꺼낸게 제일 크면 실행하고 꺼낸건 다시 안넣음
        
        우선순위와 boolean이 적힌 노드 생성
        리스트에 다 넣고
        마지막걸 꺼내서 새로운 노드에 저장하고 리스트 안에있는 값들과 비교해서 우선순위가 제일 크면
        꺼내고 count ++
        만약 boolean값이 true면 answer 제출
        
        아니라면 다시 첫번째에 삽입
         
        */
        
        List<Node> newList = new ArrayList<>();
        for(int i=0; i<priorities.length; i++){
            if(i==location){
                // Node newNode = new Node(priorities[i], true);
                newList.add(new Node(priorities[i], true));
            }else{
                // Node newNode = new Node(priorities[i], false);
                newList.add(new Node(priorities[i], false));
            }
            // System.out.println(newList.get(i).getLocation());
        }
        /*
        2 3 1 2
        
        */
        
        // for(int k=0; k<newList.size(); k++){
        //     System.out.print(newList.get(k).getPriorities());
        // }
        int count;
        while(true){
            count = 1;
            Node tmpNode = newList.remove(0);
            for(int j=0; j<newList.size(); j++){
                System.out.println(newList.get(j).getPriorities());
                if(newList.get(j).getPriorities() >tmpNode.getPriorities()){
                    newList.add(tmpNode);
                    
                    break;
                }
                count++;
            }
            if(count==newList.size()+1){
                answer++;
                if(tmpNode.getLocation()){
                    break;
                }
            }
               
            
            // System.out.println();
        }
        
        return answer;
    }
}
 class Node{
    private int priorities;
    private boolean location;
    
    public int getPriorities(){
        return  priorities;
    }
    
    public boolean getLocation(){
        return location;
    }
        
    public Node(int priorities, boolean location) {
		this.priorities = priorities;
		this.location = location;
	}
}