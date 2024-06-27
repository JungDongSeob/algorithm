function solution(s){
    var answer = true;
    let p = 0;
    let y = 0;
    s.split("").map((item) =>{
        if(item == 'p' || item == 'P' ){
            p++;
        }else if(item == 'y' || item == 'Y'){
            y++;
        }
    })
    if(p==y){
        return true;
    }else{
        return false;
    }
}