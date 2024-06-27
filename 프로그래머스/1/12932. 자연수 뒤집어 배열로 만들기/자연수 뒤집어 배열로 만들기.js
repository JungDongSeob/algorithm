function solution(n) {
    var answer = [];
    
    while(Math.floor(n/10)!=0){
        answer.push(n%10);
        n = Math.floor(n/10);
        console.log(n);
    }
    answer.push(n);
    return answer;
}