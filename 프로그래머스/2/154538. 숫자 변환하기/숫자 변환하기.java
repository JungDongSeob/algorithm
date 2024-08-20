import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static int[] check;
    public int solution(int x, int y, int n) {
        int answer = 0;
        check = new int[y+1];
        Queue<Node> q = new LinkedList<>();
        
        q.offer(new Node(x, 0));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == y) return node.count;
            
            int nx = node.x*2;
            if(nx <= y && check[nx] == 0){
                check[nx] = 1;
                q.offer(new Node(nx, node.count+1));
            }
            nx = node.x*3;
            if(nx <= y && check[nx] == 0){
                check[nx] = 1;
                q.offer(new Node(nx, node.count+1));
            }
            nx = node.x+n;
            if(nx <= y && check[nx] == 0){
                check[nx] = 1;
                q.offer(new Node(nx, node.count+1));
            }
        }
        
        return -1;
    }
}
class Node{
    int x;
    int count;
    
    public Node(int x, int count){
        this.x = x;
        this.count = count;
    }
}