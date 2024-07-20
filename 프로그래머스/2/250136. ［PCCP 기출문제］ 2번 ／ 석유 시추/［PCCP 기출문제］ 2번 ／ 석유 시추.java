import java.util.*;

class Solution {

    int[] dx={-1,0,1,0}; //x 방향
    int[] dy={0,-1,0,1}; //y 방향
    public int solution(int[][] land) {
        int answer = 0; // max값 리턴
        Queue<int[]> que = new LinkedList<>(); //bfs 큐
        int[] xSum = new int[land[0].length]; //x열 합계
        
        
        for(int x=0;x<land[0].length;x++){ //x열만큼 반복
            for(int y=0;y<land.length;y++){ //y행만큼 반복
                if(land[y][x]==-1 || land[y][x]==0) continue; //방문 했거나, 석유가 아니면 PASS
                que.offer(new int[]{x,y});
                int cnt = 0; //석유덩어리 계산
                int[] xArr = new int[land[0].length]; //**bfs 방문시 x열을 같이 기록(다시 방문 안하기 위함) 
                while(!que.isEmpty()){
                    int[] now = que.poll();
                    int nx = now[0];
                    int ny = now[1];
                    // 1) 경계값을 넘어가거나
                    // 2) 방문했거나
                    // 3) 석유가 아니면 PASS
                    if(nx<0 || ny<0 || nx>=land[0].length || ny>=land.length || land[ny][nx]==-1 || land[ny][nx]==0) continue;
                    cnt++;
                    land[ny][nx] = -1;
                    xArr[nx]=1;
                    
                    // 4방향 모두 방문
                    for(int i=0;i<4;i++){
                        int zx = nx+dx[i];
                        int zy = ny+dy[i];
                        if(zx<0 || zy<0 || zx>=land[0].length || zy>=land.length || land[zy][zx]==-1 || land[zy][zx]==0) continue;
                        que.offer(new int[]{zx,zy});    
                    }
                }
                // **bfs에서 방문했던 경우, 석유덩어리(cnt) 값을, 각 x열에 더해준다
                for(int a=0;a<xArr.length;a++){
                    if(xArr[a]==1){
                        xSum[a] += cnt;
                    }
                }
            }
            answer = Math.max(answer,xSum[x]); // x열중에서 최대값을 구해줌
        }

        return answer;
    }
}