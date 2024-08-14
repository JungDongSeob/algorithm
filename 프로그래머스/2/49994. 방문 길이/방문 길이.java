import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        List<Navi> al = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        char[] UDRL = {'U','D','R','L'};
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        int fromX = 0; int fromY = 0; int toX = 0; int toY = 0;
        
        for(int i = 0; i < UDRL.length; i++){
            map.put(UDRL[i], i);
        }
        
        for(Character nc : dirs.toCharArray()){
            int idx = map.get(nc);
            
            if(fromX + dir[idx][0] >= -5 && fromX + dir[idx][0] <= 5 && fromY + dir[idx][1] >= -5 && fromY + dir[idx][1] <= 5){
                toX = fromX + dir[idx][0];
                toY = fromY + dir[idx][1];
                
                Navi navi = new Navi(fromX, fromY, toX, toY);
                
                int i = 0;
                for(; i < al.size(); i++){
                    Navi n = al.get(i);
                    if(n.fromX == navi.fromX && n.fromY == navi.fromY && n.toX == navi.toX && n.toY == navi.toY){
                        break;
                    }
                    if(n.fromX == navi.toX && n.fromY == navi.toY && n.toX == navi.fromX && n.toY == navi.fromY){
                        break;
                    }
                }
                if(i == al.size()){
                    al.add(navi);
                }
                fromX = toX;
                fromY = toY;
                // System.out.println("fromX : " + fromX + " fromY : " + fromY);
            }
        }
        
        return al.size();
    }
}
class Navi{
    int fromX;
    int fromY;
    int toX;
    int toY;
    
    public Navi(int fromX ,int fromY ,int toX ,int toY){
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }
}