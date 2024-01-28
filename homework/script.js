function submitForm() {
    var username = document.getElementById("username").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var university = document.getElementById("university").value;
    var gender = document.querySelector('input[name="gender"]:checked');
    
    if (!username || !email || !password || !university || !gender) {
      alert("Please fill in all required fields.");
      return;
    }
    
    console.log("Username:", username);
    console.log("Email:", email);
    console.log("Password:", password);
    console.log("University:", university);
    console.log("Gender:", gender.value);
  }
