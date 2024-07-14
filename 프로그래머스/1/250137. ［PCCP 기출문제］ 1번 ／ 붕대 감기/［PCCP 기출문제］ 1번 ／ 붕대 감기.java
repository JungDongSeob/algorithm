import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int deadline = attacks[attacks.length-1][0]; // 제한시간
        int nowTime = 0;    // 현재시간
        int successTime = 0; // 연속성공
        int energy = health; // 현재 체력
            
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ;i < attacks.length; i++){
            map.put(attacks[i][0],attacks[i][1]);   // 공격정보
        }
        
        while(nowTime <= deadline){
            // System.out.println("time : " + nowTime + " energy : " + energy);
            if(map.containsKey(nowTime)){
                int damage = map.get(nowTime);  // 데미지
                successTime = 0;      // 연속시간 초기화
                
                if(energy - damage <= 0) return -1; // 죽으면 끝
                energy = energy - damage;
                
            }else{
                successTime++;
                int heal = bandage[1];   // 회복량
                
                if(successTime == bandage[0]){  // 최대연속성공이면 힐량증가
                    heal = heal + bandage[2];
                    successTime = 0;
                }
                if(energy + heal >= health){
                    energy = health;
                }else{
                    energy = energy + heal;
                }
            }
            nowTime++;
        }
        
        return energy;
    }
    /*
    시간을 맵에 넣고
    
    while(시간 <= 전체시간){
        if 맵에 시간이 있다면
            공격 = 맵에서 가져옴
            연속초 초기화
            if(체력 - 공격 <= 0) return -1
            체력 = 체력 - 공격
        else 공격을 받지 않았다면
            연속초++
            회복 = 붕대
            if(연속초 == 연속성공)
                회복 = 회복 + 추가
            if(체력+회복 >= 최대체력)
                체력 = 최대체력
            else
                체력 = 체력 + 회복
        시간++
    } 
    */
}