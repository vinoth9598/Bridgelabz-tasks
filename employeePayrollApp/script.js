
  // ---------- Local Storage ----------
  let employees = JSON.parse(localStorage.getItem("employees")) || [];

  // ---------- Event Handler ----------
  document.getElementById("empForm").addEventListener("submit", addEmployee);

  function addEmployee(event) {
    event.preventDefault();

    const employee = {
      id: Date.now(),
      name: document.getElementById("name").value,
      salary: document.getElementById("salary").value,
      department: document.getElementById("department").value
    };

    employees.push(employee);
    saveToLocalStorage();
    renderEmployees();
    event.target.reset();
  }

  function deleteEmployee(id) {
    employees = employees.filter(emp => emp.id !== id);
    saveToLocalStorage();
    renderEmployees();
  }

  function saveToLocalStorage() {
    localStorage.setItem("employees", JSON.stringify(employees));
  }

  function renderEmployees() {
    const table = document.getElementById("empTable");
    table.innerHTML = "";

    employees.forEach(emp => {
      table.innerHTML += `
        <tr>
          <td>${emp.id}</td>
          <td>${emp.name}</td>
          <td>${emp.salary}</td>
          <td>${emp.department}</td>
          <td>
            <button class="delete-btn" onclick="deleteEmployee(${emp.id})">
              Delete
            </button>
          </td>
        </tr>
      `;
    });
  }

  // ---------- Async / Promise Demo ----------
  function fetchEmployeesAsync() {
    return new Promise(resolve => {
      setTimeout(() => resolve(employees), 1000);
    });
  }

  fetchEmployeesAsync().then(() => renderEmployees());