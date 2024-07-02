function solution(strings, n) {
    let answer = [];
    
    answer = strings.sort((a,b) => {
        if(a.charCodeAt(n)==b.charCodeAt(n)){
            return a.localeCompare(b);
        }else{
            return a.charCodeAt(n)-b.charCodeAt(n);
        }
        
    });
    // answer = strings.sort((a,b) =>(a-b));
    return answer;
}