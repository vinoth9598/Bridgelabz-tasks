const employees = [
  { id: 1, name: "Rahul", salary: 50000 },
  { id: 2, name: "Priya", salary: 60000 },
  { id: 3, name: "Amit", salary: 55000 }
];

// Employee Service using Promise
function getEmployeeById(empId) {
  return new Promise((resolve, reject) => {
    console.log("Fetching employee data...");

    setTimeout(() => {
      const employee = employees.find(emp => emp.id === empId);

      if (employee) {
        resolve(employee);
      } else {
        reject("Employee Not Found");
      }
    }, 2000);
  });
}

// Service Call
getEmployeeById(3)
  .then(data => {
    console.log("Employee Data:", data);
  })
  .catch(error => {
    console.log("Error:", error);
  });