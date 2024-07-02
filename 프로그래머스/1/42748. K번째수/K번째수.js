function solution(array, commands) {
    let answer = [];
    
//     for(let i = 0; i < commands.length; i++){
//         let x = commands[i][1] - commands[i][0]+1;
//         console.log(commands[i][0] - 1);
//         console.log(x);
        
//         let tmp = array.splice(commands[i][0] - 1, x)
//         tmp.sort((a,b) => (a-b));
//         console.log(tmp);
//         answer.push(tmp[commands[i][2]-1]);
//     }
        for(let i = 0; i < commands.length; i++){
        let x = commands[i][1] - commands[i][0]+1;
        
        let tmp = array.slice(commands[i][0] - 1, commands[i][1])
        tmp.sort((a,b) => (a-b));

        answer.push(tmp[commands[i][2]-1]);
    }
    
    return answer;
}