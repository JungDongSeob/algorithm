// Run by Node.js

const readline = require("readline");
const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});
inputLines = [];
rl.on("line", function(line) {
	// console.log(line);
	inputLines.push(line);
	rl.close();
}).on("close", function() {
	solution(inputLines);
	process.exit();
});

function solution(input) {
  // 여기서부터 문제를 해결하는 로직을 작성합니다.
  // input은 입력으로 받은 모든 줄을 포함하는 배열입니다.

	let a = input[0];
	a = a.replace(/\s+/g," ");

	if(a == " "){
		console.log(0);
	}else{
		a = a.trim();
		let b = a.split(" ");
		console.log(b.length);

	}
	




  
  // 추가적인 문제 해결 로직을 이곳에 작성합니다.
}