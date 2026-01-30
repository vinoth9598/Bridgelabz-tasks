let employees = JSON.parse(localStorage.getItem("employees")) || [];

let form = document.getElementById("formContent");
let list = document.getElementById("table-content");

function renderEmployees(){
    employees.innerHTML="";
    employees.forEach((emp, index)=>{        
        list.innerHTML += `
            <tr>
                <td><img src="./img/profile.jpg" width="80" height="80"></td>
                <td>${emp.name}</td>
                <td>${emp.id}</td>
                <td>${emp.email}</td>
                <td>${emp.contact}</td>
                <td><button class="update" onclick="editForm(${index})" >Edit</button></td>
                <td><button class="delete" onclick="remove(${index})" >Delete</button></td>
            </tr>
        `;
    });
}

form.addEventListener('submit', e => {
    e.preventDefault();

    const employee = {
        name:empName.value ,
        id : empId.value,
        email:email.value,
        contact:contact.value 
    };

    console.log(employee);

    employees.push(employee);
    localStorage.setItem('employees', JSON.stringify(employees));
    form.reset();
    renderEmployees();
});

renderEmployees();


function remove(index){
    employees.splice(index, 1);
    localStorage.setItem("employees", JSON.stringify(employees));
    location.reload();
}


function editForm(index){

   employees.forEach((emp, i) => {
    if(index == i){
        let fname = document.getElementById("empName"); 
        fname.value = emp.name ;

        let id = document.getElementById("empId");
        id.value = emp.id ;

        let email = document.getElementById("email");
        email.value = emp.email ;

        let contact = document.getElementById("contact");
        contact.value = emp.contact ;

        }
   });

}