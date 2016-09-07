function register() {

	var emailid = document.getElementById("email").value;
	var emailid1 = document.getElementById("email1").value;
	var password = document.getElementById("pwd").value;
	var name = document.getElementById("uname").value;
	var first = document.getElementById("fname").value;
	var last = document.getElementById("lname").value;
	/*
	 * var regex = /^[a-zA-Z0-9 ]{1,30}$/;
	 * 
	 * if(name != regex) { alert("Username should contain only alphabets");
	 * return false; }
	 */

	if (name == "") {
		alert("Enter the username you want to register");
		return false;
	} else if (first == "") {
		alert("Enter your first name");
		return false;
	} else if (last == "") {
		alert("Enter your last name");
		return false;
	} else if (password == "") {
		alert("Enter the password");
		return false;
	}

	else if (emailid == "" || emailid1 == "") {
		alert("please enter your emailid");
		return false;

	} else if (emailid != emailid1) {
		alert("Given email is not recognized by our database");
		return false;

	} else if (password.length < 6 || password.length >= 8) {
		alert(name + "Please enter correct password");
		return false;

	
	} else {
		alert("Successfully registered,Click login!!!");
		return false;
	}
}
