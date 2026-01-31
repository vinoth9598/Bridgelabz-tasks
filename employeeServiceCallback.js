const employees = [
  { id: 1, name: "Rahul", salary: 50000 },
  { id: 2, name: "Priya", salary: 60000 },
  { id: 3, name: "Amit", salary: 55000 }
];

// Employee Service using Callback
function getEmployeeById(empId, callback) {
  console.log("Fetching employee data...");

  setTimeout(() => {
    const employee = employees.find(emp => emp.id === empId);

    if (employee) {
      callback(null, employee);
    } else {
      callback("Employee Not Found", null);
    }
  }, 2000);
}

// Service Call
getEmployeeById(2, (error, data) => {
  if (error) {
    console.log("Error:", error);
  } else {
    console.log("Employee Data:", data);
  }
});