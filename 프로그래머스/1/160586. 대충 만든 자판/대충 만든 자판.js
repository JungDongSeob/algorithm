function solution(keymap, targets) {
    let answer = [];
    let keyBoard = new Map();
    
    for(x of keymap){
        for(let i = 0; i < x.length; i++){
            if(!keyBoard.has(x[i])){
                keyBoard.set(x[i],i+1)
            }else if(keyBoard.get(x[i])>i+1){
                keyBoard.set(x[i],i+1);
            }
        }
    }
    
    for(x of keyBoard.entries()){
        console.log(x);
    }
    
    for(x of targets){
        let num = 0;
        for(let i = 0; i < x.length; i++){
            if(keyBoard.has(x[i])){
                num = num + keyBoard.get(x[i]);
            }else{
                num = -1;
                break;
            }
        }
        answer.push(num);
    }
    
    
    return answer;
}