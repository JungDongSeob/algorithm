function solution(s) {
    let answer = 0;
    
    while(s){
        // console.log(s);
        let lt = 1;
        let rt = 0;
        for(let i = 1; i < s.length; i++){
            if(s[0] === s[i]){
                lt++;
            }else{
                rt++;
            }
            if(lt===rt){
                answer++;
                s = s.slice(i+1);
                break;
            }
            if(i+1 === s.length){
                answer++;
                s='';
            }
        }
        if(s.length === 1){
            answer++;
            s='';
        }
    }
    
    return answer;
}