const form = document.querySelector('myform')
const username = document.querySelector('username')
const email = document.querySelector('password')
const confirm = document.querySelector('confirm')
const isAdmin = document.querySelector('isAdmin')
const submit = document.querySelector('Submit')

form.addEventListener('submit', (e) => {
    e.preventDefault()
    const user = {
        name: username.value,
        email: email.value,
        password: password.value,
        confirm: confirm.value
    }
    if (password.value !== confirm.value) {
        alert(Confirm is not match Password)
        return
    } else if (isAdmin.checked) {
        window.location = 'user.html'
    } else {
        console.log('user', user);

    }
})

function removeDisabled(anyInput) {
    anyInput.addEventListener('change', () =>{
        if (username.valuse && email.value && password.value)
    }
}