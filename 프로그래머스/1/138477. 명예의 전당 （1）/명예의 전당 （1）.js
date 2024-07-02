function solution(k, score) {
    let answer = [];
    let result = [];

    for(x of score){

        answer.push(x);
        answer = answer.sort((a,b) => (b-a)).splice(0,k);

        result.push(answer[answer.length-1]);
    }
    return result;
}