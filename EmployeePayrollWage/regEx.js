// pin Number validate 

function validatePin(pin){
    const pinRegex = /^[1-9]\d{2}\s?\d{3}$/ ;

    return pinRegex.test(pin);
}

console.log(validatePin("400088"));
console.log(validatePin("A400088"));
console.log(validatePin("400088B"));
console.log(validatePin("400 088"));

console.log("____________checkEmail______________");

function validateEmail(email){

    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

    return emailRegex.test(email);
}

console.log(validateEmail("vinoth@gmail.com"));
console.log(validateEmail("vino12.gmail.com"));
console.log(validateEmail("123vinoth@gmail.com"));
console.log(validateEmail("vinoth.123@gmail"));