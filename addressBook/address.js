let contacts = JSON.parse(localStorage.getItem('contacts')) || [];


const form = document.getElementById('addressForm');
const list = document.getElementById('contactList');


function renderContacts() {
    list.innerHTML = '';
    contacts.forEach((c, index) => {
        list.innerHTML += `
        <tr>
        <td>${c.name}</td>
        <td>${c.phone}</td>
        <td>${c.email}</td>
        <td>${c.city}</td>
        <td><button class="delete" onclick="deleteContact(${index})">Delete</button></td>
        </tr>`;
    });
}

function deleteContact(index) {
    contacts.splice(index, 1);
    localStorage.setItem('contacts', JSON.stringify(contacts));
    renderContacts();
}


form.addEventListener('submit', e => {
    e.preventDefault();
    const contact = {
        name: fname.value,
        phone: phone.value,
        email: email.value,
        city: city.value
    };
    contacts.push(contact);
    localStorage.setItem('contacts', JSON.stringify(contacts));
    form.reset();
    renderContacts();
});


renderContacts();