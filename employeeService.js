const API_URL = "http://localhost:3000/employees";

// Get employees 

function loadEmployees() {
  fetch(API_URL)
    .then(res => res.json())
    .then(data => {
      const table = document.getElementById("empTable");
      table.innerHTML = "";

      data.forEach(emp => {
        table.innerHTML += `
          <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.salary}</td>
            <td>
              <button onclick="deleteEmployee(${emp.id})">Delete</button>
            </td>
          </tr>
        `;
      });
    });
}


// Post employees 
function addEmployee(event) {
  event.preventDefault();

  const employee = {
    name: document.getElementById("name").value,
    salary: document.getElementById("salary").value
  };

  fetch(API_URL, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(employee)
  })
  .then(() => {
    loadEmployees();
    event.target.reset();
  });
}


// Delete Employees 
function deleteEmployee(id) {
  fetch(`${API_URL}/${id}`, {
    method: "DELETE"
  })
  .then(() => loadEmployees());
}

loadEmployees();

