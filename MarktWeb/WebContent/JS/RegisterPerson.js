/**
 * 
 */

function RegisterPerson() {
  var firstName = document.getElementById("firstName").value;
  var lastName = document.getElementById("lastName").value;
  var emailAdres = document.getElementById("emailAdres").value;
  var photo = document.getElementById("photo").value;
		
  var xhttp = new XMLHttpRequest();
  xhttp.open("POST", "/MarktWeb/rest/HelloWorld/person/1", true);
  xhttp.setRequestHeader("Content-Type", "application/json");
  xhttp.send(JSON.stringify({firstName:firstName, lastName:lastName, email:emailAdres, photo:photo}));
}