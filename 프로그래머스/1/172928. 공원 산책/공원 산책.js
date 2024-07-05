function solution(park, routes) {
    let answer = [];
    let startX;
    let startY;

    
    for(let i = 0; i < park.length; i++){
        for(let j = 0; j < park[0].length; j++){
            if(park[i][j] === 'S'){
                startX = i;
                startY = j;
            }
        }
    }
    
    // for(let i = 0; i<park.length; i++){
    //     for(let j = 0; j < park[0].length; j++){
    //         console.log(park[i][j]);
    //     }
    // }
    for(x of routes){
        let num = Number(x[2]);
        
        // console.log(`${startX} ${startY}`);
        if(x[0] === 'W' && startY-num >= 0){
            let limit = startY-num;
            for(let i = startY; i >= limit; i--){
                if(park[startX][i] === 'X'){
                    break;
                }
                if(i === startY-num){
                    startY = startY-num;
                }
            }
        }else if(x[0] === 'E' && startY+num < park[0].length){
            let limit = startY+num;
            for(let i = startY; i <= limit; i++){
                if(park[startX][i] === 'X'){
                    break;
                }
                if(i === startY+num){
                    startY = startY+num;
                }
            }
        }else if(x[0] === 'N' && startX-num >= 0){
            let limit = startX-num;
            for(let i = startX; i >= limit; i--){
                if(park[i][startY] === 'X'){
                    break;
                }
                if(i === startX-num){
                    startX = startX-num;
                }
            }   
        }
        else if(x[0] === 'S' && startX+num < park.length){
            let limit = startX+num;
            for(let i = startX; i <= limit; i++){
                if(park[i][startY] === 'X'){
                    break;
                }
                if(i === startX+num){
                    startX = startX+num;
                }
            }
        }
    }
    /*
    N - S + W - E +
    */
    // console.log(startX);
    // console.log(startY);
    return [startX, startY];
}