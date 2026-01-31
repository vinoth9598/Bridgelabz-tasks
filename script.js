function getEmployee() {
  fetch("https://jsonplaceholder.typicode.com/users/1")
    .then(response => response.json())
    .then(data => {
      document.getElementById("output").innerText =
        "Employee Name: " + data.name + "\nEmail: " + data.email;
    })
    .catch(error => {
      document.getElementById("output").innerText = "Error fetching data";
    });
}


// using xml http request

// function getEmployee() {
//   const xhr = new XMLHttpRequest();
//   xhr.open("GET", "https://jsonplaceholder.typicode.com/users/2");

//   xhr.onload = function () {
//     if (xhr.status === 200) {
//       const emp = JSON.parse(xhr.responseText);
//       document.getElementById("output").innerText =
//         "Employee Name: " + emp.name;
//     }
//   };

//   xhr.send();
// }