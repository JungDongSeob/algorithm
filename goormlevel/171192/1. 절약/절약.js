// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let input = [];
	for await (const line of rl) {
		if(!line){
			rl.close();	
		}else{
			let a = line.split(" ");
			input.push(a);
		}
	}
	main(input);
	process.exit();
})();

function main(input){
	let answer = 0;
	let ans = 'success';
	
	for(x of input){
		if(x.length === 2){
			
			// console.log(x);
			if(x[0] === 'in'){
				answer = answer + Number(x[1]); 
			}else{
				answer = answer - Number(x[1]);
			}
			
			if(answer < 0){
				ans = 'fail';
			}
		}
	}

	console.log(ans);
	// console.log('success');
}