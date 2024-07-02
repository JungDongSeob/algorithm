function solution(numbers) {

    let set = new Set();
    for(let i = 0; i < numbers.length-1; i++){
        for(let j = i+1; j <numbers.length; j++){
            set.add(numbers[i]+numbers[j]);
        }
    }
    console.log(set);
    let answer = [...set];
    console.log(answer);
    answer.sort((a,b) => (a-b));
    
    return answer;
}