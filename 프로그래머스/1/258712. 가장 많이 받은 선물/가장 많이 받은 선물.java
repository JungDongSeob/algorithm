import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        Map<String, Integer> giftScore = new HashMap<>();
        Map<String, Integer> friendsIndex = new HashMap<>();
        int[] nextMonth = new int[len];
        int[][] giveAndTake = new int[len][len];
        
        for(int i = 0; i < len; i++){
            friendsIndex.put(friends[i], i);
        }
        
        for(int i = 0; i < gifts.length; i++){
            String[] gift = gifts[i].split(" ");
            
            int x = friendsIndex.get(gift[0]);
            int y = friendsIndex.get(gift[1]);
            
            giftScore.put(gift[0], giftScore.getOrDefault(gift[0],0)+1);
            giftScore.put(gift[1], giftScore.getOrDefault(gift[1],0)-1);
            giveAndTake[x][y] = giveAndTake[x][y] + 1;
        }
        
        for(int i = 0; i < giveAndTake.length; i++){
            for(int j = 0; j <giveAndTake[0].length; j++){
                if(i == j) continue;
                
                if(giveAndTake[i][j] > giveAndTake[j][i]){
                    
                    nextMonth[i] = nextMonth[i] + 1;
                    // System.out.println(giveAndTake[i][j] + " " + giveAndTake[j][i]);
                    // System.out.println(friends[i] + " : " + nextMonth[i]);
                }else if ((giveAndTake[i][j] == giveAndTake[j][i]) && (giftScore.getOrDefault(friends[i],0) > giftScore.getOrDefault(friends[j], 0))){
                    nextMonth[i] = nextMonth[i] + 1;
                    // System.out.println(giveAndTake[i][j] + " " + giveAndTake[j][i] + " " + giftScore.get(friends[i]) + " " + giftScore.get(friends[j]));
                    // System.out.println(friends[i] + " : " + nextMonth[i]);
                }
            }
        }
        
        for(int i = 0; i < len; i++){
            if(answer < nextMonth[i]){
                answer = nextMonth[i];
            }
        }
        return answer;
    }
    
    /*
    선물지수 map
    friends가 있는 인덱스번호 map
    nextMonth[]
    선물 주고 받은 개수 n x n 배열 
    
    for{
        int[] gift = gifts[i].split(" ");
        x = 위치.get(gift[0]);
        y = 위치.get(gift[i]);
        선물지수.put(gift[0], getorDefault(gift[0],0)+1);
        선물지수.put(gift[1], getorDefault(gift[1],0)-1);
        giveAndTake[x][y] = +1
    }
    
    for{
        for{
            if( i == j ) continue;
            if (GNT[i][j] > GNT[j][i] ){
                NM[i]++
            }else if(GNT[i][j] == GNT[j][i]){
                if(map.friends[i] > map.friends[i]){
                    NM[i]++
                }else if(map.friends[i] < map.friends[i]){
                    NM[j]++
                }
            }else{
                NM[j]++
            }
        }
    }
    */
}