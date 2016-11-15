/**
 * 
 */

/**
 * 

function formSubmit() {
  var firstName = document.getElementById("firstName").value;
  var lastName = document.getElementById("lastName").value;
  var emailAdres = document.getElementById("emailAdres").value;
  var photo = document.getElementById("photo").value;
		
  var xhttp = new XMLHttpRequest();
  xhttp.open("POST", "/MarktWeb/rest/HelloWorld/person/1", true);
  xhttp.setRequestHeader("Content-Type", "application/json");
  xhttp.send(JSON.stringify({firstName:firstName, lastName:lastName, email:emailAdres, photo:photo}));
}

 */


function registerPerson() {
  var firstName = document.getElementById("firstName").value;
  var lastName = document.getElementById("lastName").value;
  var emailAdres = document.getElementById("emailAdres").value;
  var photo = document.getElementById("photo").value;
		
  var xhttp = new XMLHttpRequest();
  xhttp.open("POST", "/MarktWeb/rest/HelloWorld/person/1", true);
  xhttp.setRequestHeader("Content-Type", "application/json");
  xhttp.send(JSON.stringify({firstName:firstName, lastName:lastName, email:emailAdres, photo:photo}));
}

function registerItem() {
	  var titel = document.getElementById("titel").value;
	  var omschrijving = document.getElementById("omschrijving").value;
	  var foto = document.getElementById("foto").value;
	  var prijs = document.getElementById("prijs").value;
	  var status = document.getElementById("status").value;
			
	  var xhttp = new XMLHttpRequest();
	  xhttp.open("POST", "/MarktWeb/rest/HelloWorld/item", true);
	  xhttp.setRequestHeader("Content-Type", "application/json");
	  xhttp.send(JSON.stringify({titel:titel, omschrijving:omschrijving, foto:foto, prijs:prijs, status:status}));
	}

function load1Item() {
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      var json = JSON.parse(this.responseText)
	      var text = ""
	      for (var i = 0; i < json.length; i++) {
	        text += "<p>" + "Titel" + json[i].titel + " Omschrijving: "+ json[i].omschrijving +  " Foto: <img src=static/images/" +  json[i].foto + ".jpg" + " prijs:" + json[i].prijs +  " status:" + json[i].status + "</p>" }
	      }
	      document.getElementById("maincontent").innerHTML = text
	    };
	  xhttp.open("GET", "/MarktWeb/rest/HelloWorld/item/1", true);
	  xhttp.send();
	}

