

let form = document.getElementById("myForm");
    
let employees = [];

window.onload = function(){
    let storedData = localStorage.getItem("employees");

    if(storedData){
        employees = JSON.parse(storedData);
        displayEmployees();
    }
};

form.addEventListener('submit', function(e){
    e.preventDefault();

    let name = document.getElementById("name").value ;
    let empId = document.getElementById("empId").value ;
    let role = document.getElementById("role").value ;
    let email = document.getElementById("email").value ;
    let salary = document.getElementById("wage").value ;
    let hrs = document.getElementById("hours").value ;

   if(name === "" || empId === "" || role === "" || email === "" || salary === "" || hrs === ""){
    alert("Please fill all fields");
    return ;
   }

   let employee = {
    name : name ,
    empId :Number(empId),
    role : role ,
    email : email ,
    salary : Number(salary),
    hrs : Number(hrs)
   };

   employees.push(employee);

   localStorage.setItem("employees", JSON.stringify(employees));

   displayEmployees();
   clearFields();
});

function displayEmployees() {
  let table = document.getElementById("employeeTable");
  table.innerHTML = "";

  employees.forEach(emp => {
    let row = document.createElement("tr");
    row.innerHTML = `
      <td>${emp.name}</td>
      <td>${emp.empId}</td>
      <td>${emp.role}</td>
      <td>${emp.email}</td>
      <td>${emp.salary}</td>
      <td>${emp.hrs}</td>
    `;
    table.appendChild(row);
  });
}

function clearFields(){
    document.getElementById("name").value = "";
    document.getElementById("empId").value = "";
    document.getElementById("role").value = "" ;
    document.getElementById("email").value = "";
    document.getElementById("wage").value ="" ;
    document.getElementById("hours").value = "";
}

