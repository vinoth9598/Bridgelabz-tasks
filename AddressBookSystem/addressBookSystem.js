class Person{
    constructor(firstName,lastName,address,city,state,zip,phone,email){
        this.firstName = this.validateName(firstName) ;
        this.lastName = lastName ;
        this.address = address ;
        this.city = city ;
        this.state = state ;
        this.zip = this.validatePin(zip) ;
        this.phone = this.validatePhone(phone);
        this.email = this.validateEmail(email);
    }

    validateName(name){
        const nameRegex =/^[A-Z][a-z]{2,}$/;
        if(!nameRegex.test(name)){
            throw "Name must start with Capital & min 3 letters";
        } 
        return name ;
    }

    
    validatePin(zip) {
        const zipRegex = /^[1-9]\d{5}$/;
        if (!zipRegex.test(zip)) {
            throw "Invalid ZIP code";
        }
        return zip;
    }

    validatePhone(phone) {
        const phoneRegex = /^[6-9]\d{9}$/;
        if (!phoneRegex.test(phone)) {
            throw "Invalid phone number";
        }
        return phone;
    }

    validateEmail(email) {
        const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        if (!emailRegex.test(email)) {
            throw "Invalid email";
        }
        return email;
    }

    toString() {
        return `${this.firstName} ${this.lastName}, ${this.city}, ${this.state}`;
    }
}


class AddressBook {
    constructor(){
        this.contacts = [];
    }

    addContact(person){
        if(this.contacts.some(p => p.phone === person.phone)){
            throw "Duplicate contact not allowed";
        }else {
            this.contacts.push(person);
        }
    }

    display(){
        this.contacts.forEach(c => console.log(c.toString()));
    }

    deleteContact(firstName){
        const index = this.contacts.findIndex(
            person => person.firstName === firstName
        );

        if(index !== -1){
            this.contacts.splice(index, 1);
            console.log(`${firstName} deleted successfully`);
        }else {
            console.log(`${firstName} not found`);
        }
    }

    findContacts(name){
        let contact = this.contacts.reduce(c => c.firstName === name) ;
        console.log("Number : ",contact.phone);
    }
    searchByCity(city){
        return this.contacts.filter(c => c.city === city);
    }

    searchByState(state){
        return this.contacts.filter(s => s.state === state);
    }

    sortByName(){
       let sortName = this.contacts.sort((a,b)=>{
            if (a.firstName > b.firstName) return 1 ;
            if(a.firstName < b.firstName) return -1 ;
            return 0 ;
       })
        
        console.log(sortName);

    }
}

try{

    let addressBook = new AddressBook();

    let p1 = new Person(
        "Vinoth",
        "Developer",
        "Main Road",
        "Chennai",
        "Tamil Nadu",
        "600001",
        "9898878776",
        "vinoth@gmail.com"
    );

    let p2 = new Person(
        "Arun",
        "Kumar",
        "MG Road",
        "Bangalore",
        "Karnataka",
        "560001",
        "9787876776",
        "arun@gmail.com"
    );

    addressBook.addContact(p1);
    addressBook.addContact(p2);

    console.log("\n Address Book");
    addressBook.display();

    // addressBook.deleteContact("Arun");
    addressBook.findContacts("Vinoth");

    addressBook.sortByName();
  
    console.log("\n People in Chennai");
    console.log(addressBook.searchByCity("Chennai"));


}catch(error){
    console.log("Error : ", error);
}