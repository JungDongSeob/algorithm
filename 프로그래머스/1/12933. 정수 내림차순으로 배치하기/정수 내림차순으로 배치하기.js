function solution(n) {

    
    let answer = (n+"").split("").sort((item1, item2)=>{
        return item2 - item1
    }).join("");
    
    answer = Number(answer);
    
    return answer;
}