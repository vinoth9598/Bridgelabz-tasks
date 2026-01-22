
// Generate ten random three digit number 

let i = 1 ;
let randomNum = [];

while(i <= 10){
    randomNum.push(Math.floor(Math.random()*900)+100);
    i++;
}

let largest = -Infinity ;
let secondLargest = -Infinity ;
let smallest = Infinity ;
let secondSmallest = Infinity ;

for(let num of randomNum){

    if(num > largest){
        secondLargest = largest ;
        largest = num ;
    }else if (num > secondLargest && num != largest ){
        secondLargest = num ;
    }

    if(num < smallest){
        secondSmallest = smallest ;
        smallest = num ;
    }else if(num < secondSmallest && num != smallest){
        secondSmallest = num ;
    }
}

console.log("2nd Largest :", secondLargest);
console.log("2nd smallest :", secondSmallest);


// sort the array and find (second largest and small numbers )

let numbers = [];

for(let i=0; i<10; i++){
    numbers.push(Math.floor(Math.random() * 900) + 100);
}

let sortedNumbers = numbers.sort((a,b)=> a - b);

let secondLargestNum = sortedNumbers[sortedNumbers.length-2];
let secondSmallestNum = sortedNumbers[1];

console.log(sortedNumbers);
console.log(secondLargestNum);
console.log(secondSmallestNum);

// Prime Factorization program 

let n = 84 ;
let primeFactors = [];

while(n%2 == 0){
    primeFactors.push(2);
    n = n/2 ;
}

for(let i=3; i*i <= n; i+=2){
    while(n%i == 0){
        primeFactors.push(i);
        n = n/i ;
    }
}

if(n > 2){
    primeFactors.push(n);
}


console.log("Prime Factors :", primeFactors);

// sum of Three Integers Equals Zero

let arr = [0, -1, 2, -3, 1];

// Store triplets
let triplets = [];

// Find triplets
for (let i = 0; i < arr.length - 2; i++) {
  for (let j = i + 1; j < arr.length - 1; j++) {
    for (let k = j + 1; k < arr.length; k++) {
      if (arr[i] + arr[j] + arr[k] === 0) {
        triplets.push([arr[i], arr[j], arr[k]]);
      }
    }
  }
}

// Display result
if (triplets.length > 0) {
  console.log("Triplets whose sum is ZERO:");
  console.log(triplets);
} else {
  console.log("No triplets found");
}

// Repeated Digits (0-100) 
let repeatedDigits = [];

for(let i = 1; i <= 100; i++){
    let numStr = i.toString();

    if(numStr.length === 2 && numStr[0] == numStr[1]){
        repeatedDigits.push(i);
    }
}

console.log(repeatedDigits);