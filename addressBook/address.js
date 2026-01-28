let contacts = JSON.parse(localStorage.getItem('contacts')) || [];


const form = document.getElementById('contactForm');
const table = document.getElementById('contactTable');
const search = document.getElementById('search');

let firstName = document.getElementById("name");
let address = document.getElementById("address");
let city = document.getElementById("city");
let state = document.getElementById("state");
let zip = document.getElementById("zip");
let phone = document.getElementById("phone");
let email = document.getElementById("email");

function saveToLocalStorage() {
    localStorage.setItem('contacts', JSON.stringify(contacts));
}

function renderContacts(data = contacts) {
    table.innerHTML = '';
    data.forEach((c, index) => {
        const row = document.createElement('tr');
        row.innerHTML = `
        <td>${c.firstName}</td>
        <td>${c.address}</td>
        <td>${c.city}</td>
        <td>${c.state}</td>
        <td>${c.zip}</td>
        <td>${c.phone}</td>
        <td>${c.email}</td>
        <td class="actions">
        <button class="edit" onclick="editContact(${index})">Edit</button>
        <button class="delete" onclick="deleteContact(${index})">Delete</button>
        </td>
        `;
        table.appendChild(row);
    });
}

form.addEventListener('submit', e => {
    e.preventDefault();


    const contact = {
        firstName: firstName.value,
        address: address.value,
        city: city.value,
        state: state.value,
        zip: zip.value,
        phone: phone.value,
        email: email.value
    };


    const id = contact.value;
    if (id === '') {
    contacts.push(contact);
    } else {
    contacts[id] = contact;
    }

    saveToLocalStorage();
    renderContacts();   
    form.reset();
    contact.value = '';
});

search.addEventListener('input', () => {
    const value = search.value.toLowerCase();
    const filtered = contacts.filter(c =>
    c.firstName.toLowerCase().includes(value) ||
    c.lastName.toLowerCase().includes(value) ||
    c.city.toLowerCase().includes(value) ||
    c.state.toLowerCase().includes(value)
    );
    renderContacts(filtered);
});


renderContacts();