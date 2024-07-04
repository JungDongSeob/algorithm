function solution(cards1, cards2, goal) {
    var answer = 'Yes';
    let lt = 0;
    let rt = 0;
    
    for(let i = 0; i < goal.length; i++){
        if(cards1[lt] === goal[i]){
            lt++;
        }else if(cards2[rt] === goal[i]){
            rt++;
        }else{
            return 'No';
        }
    }
    return answer;
}