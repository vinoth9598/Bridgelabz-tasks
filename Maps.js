
let diceCount = {1:0, 2:0, 3:0, 4:0, 5:0, 6:0};

function rollDie(){
    return Math.floor(Math.random() * 6) + 1;
}

let reachedTen = false ;

while(!reachedTen){
    let result = rollDie();
    diceCount[result]++ ;

    if(diceCount[result] === 10){
        reachedTen = true ;
    }
}

console.log("Dice Roll count :", diceCount);

let maxCount = -Infinity ;
let minCount = Infinity ;

let maxNum, minNum ;

for(let num in diceCount){
    if(diceCount[num] > maxCount){
        maxCount = diceCount[num];
        maxNum = num ;
    }

    if(diceCount[num] < minCount){
        minCount = diceCount[num];
        minNum = num ;
    }
}

console.log(`Maximum occured number: ${maxNum} (${maxCount} times)`);
console.log(`Minimum occured number: ${minNum} (${minCount} times)`);


// Birth Month of 50 Individuals (1992–1993)

const birthMonthMap = new Map();

for(let personId = 1; personId <= 50; personId++){
    
    const month = Math.floor(Math.random()*12) + 1;
    const year = Math.random() < 0.5 ? 1992 : 1993 ;

    if(!birthMonthMap.has(month)){
        birthMonthMap.set(month, []);
    }
    birthMonthMap.get(month).push({
        id:personId,
        year: year 
    });

    console.log(`Person ${personId} -> Month: ${month}, year: ${year}`);
}

console.log("\n=== Individuals Grouped By Birth Month ===");

birthMonthMap.forEach((people, month)=>{
    console.log(`Month ${month}:`);
    people.forEach(person => 
        console.log(`  person ${person.id} (year ${person.year}) `)
    );
});