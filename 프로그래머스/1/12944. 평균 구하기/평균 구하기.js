function solution(arr) {

    
    let answer = arr.reduce((acc,val)=>{
        return acc+val
    },0)
    return answer/arr.length;
}