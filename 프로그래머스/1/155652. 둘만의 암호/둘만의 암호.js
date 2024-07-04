function solution(s, skip, index) {
    let answer = '';
    let a = 'z';
    // if(a === 'z'){
    //     console.log('a');
    // }
    
    // console.log(String.fromCharCode(b.charCodeAt(0)));
    for(x of s){
        let al = x;
        for(let i = 0; i<index; i++){
            if(al === 'z'){
                al = 'a';
            }else{
                al = String.fromCharCode(al.charCodeAt(0)+1);
            }
            if(skip.includes(al)){
                i--;
            }
        }
        answer = answer + al;
    }
    return answer;
}