
// powersOfTwo.js

const n = parseInt(256);

if (isNaN(n) || n < 0) {
  console.log("Please enter a valid non-negative number");
  process.exit(1);
}

let power = 0;
let value = 1;

console.log("Power\t2^Power");

while (power <= n && value <= 256) {
  console.log(`${power}\t${value}`);
  value = value * 2;
  power++;
}


// Find the magic number 

let low = 1;
let high = 100 ;
let found = false ;

console.log("Think of a number between 1 and 100.");

while(!found && low <= high){
    let mid = Math.floor((low+high)/2);

    console.log(`Is your number ${mid}`)
    console.log("Enter :");
    console.log("1 -> My number is Less than this");
    console.log("2 -> My number is Greater than this");
    console.log("3 -> Yes,this is my number");

    let choice = parseInt(prompt("Your choice :"));

    if(choice === 1){
        high = mid - 1 ;
    }else if(choice === 2){
        low = mid + 1 ;
    }else if(choice === 3){
        console.log( `Magic number found : ${mid}`);
        found = true ;
    }else {
        console.log("Invalid input.Try again");
    }
}

// Flip coin problem 

let flip = 11 ;
let i = 1 ;
while(i <= flip){
    let coins = ["Head","Tail"];

    let n = Math.floor(Math.random()*2);
    console.log(i, " is a ",coins[n])
    i++ ;
}


