function solution(arr) {
    let answer = [];
    let min = Number.MAX_SAFE_INTEGER;
    let idx = 0;

    for(let i = 0; i < arr.length; i++){
        if(min > arr[i]){
            min = arr[i];
            idx = i;
        }
    }
    
    arr.splice(idx,1);
    
    if(arr.length == 0){
        return [-1]
    }else{
        return arr;
    }
    
}