function solution(phone_number) {
    let answer = '';
    
    for(let i = 0; i < phone_number.length; i++){
        if(i + 4 >= phone_number.length){
            answer = answer + phone_number[i];
        }else{
            answer = answer + '*';
        }
    }
    return answer;
}