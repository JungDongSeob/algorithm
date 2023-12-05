// class Solution {
//     public long[] solution(int x, int n) {
//         long[] answer = new long[n];

//         for(long i=0; i<n; i++){
//             answer[i]=(long)x*(i+1);
//         }
//         return answer;
//     }
// }
class Solution {
  public long[] solution(int x, int n) {
      long[] result = new long[n];
        for (int i = 0; i < result.length; ++i) {
            result[i] = (long)x * (i + 1);
        }
        return result;
  }
}