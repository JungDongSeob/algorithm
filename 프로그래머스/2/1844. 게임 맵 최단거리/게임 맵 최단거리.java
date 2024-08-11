import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int answer = -1;
    static int[][] check;
    public void bfs(int x, int y, int[][] maps){
        Queue<Node> q = new LinkedList<>();
        
        q.offer(new Node(x,y,1));
        
        while(!q.isEmpty()){
            Node n = q.poll();
            
            if(n.x == maps.length - 1 && n.y == maps[0].length - 1){
                answer = n.dis;
            }
            for(int i = 0; i < 4; i++){
                int nx = n.x + dx[i];
                int ny = n.y + dy[i];
                
                if(0<= nx && nx < maps.length && 0 <= ny && ny < maps[0].length && maps[nx][ny] == 1 && check[nx][ny] == 0){
                    check[nx][ny] = 1;
                    q.offer(new Node(nx, ny, n.dis+1));
                }
            }
        }
        
        
    }
    public int solution(int[][] maps) {
        check = new int[maps.length][maps[0].length];
        bfs(0, 0, maps);
        
        return answer;
    }
}
class Node{
    int x;
    int y;
    int dis;
    
    public Node(int x, int y, int dis){
        this.x = x;
        this.y = y;
        this.dis = dis;
    }
}