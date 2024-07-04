function solution(name, yearning, photo) {
    let answer = [];
    
    let MAP = new Map();
    
    name.forEach((_,idx) => MAP.set(name[idx], yearning[idx]));
    
    let result = photo.map((row) => {
        return row.reduce((pre,val)=> {
            
            if(MAP.has(val)){
                return pre+MAP.get(val);
            }
             return pre;
        },0)
    })
    
    return result;
}