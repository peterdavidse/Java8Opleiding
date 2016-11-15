/**
 * js scripts
 *
 */

function loadHeader() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	document.getElementById("header").innerHTML = this.responseText;
	}
	xhttp.open("GET", "/MarktWeb/parts/Header.html", true);
	xhttp.send();
}

function loadNavBar() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		document.getElementById("navbar").innerHTML = this.responseText
	}
	xhttp.open("GET", "/MarktWeb/parts/NavBar.html", true);
	xhttp.send();
}

function loadMainPage() {
	loadHeader();
	showMainPage();
	loadNavBar();
}

function showMainPage() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		document.getElementById("maincontent").innerHTML = this.responseText
	}
	xhttp.open("GET", "/MarktWeb/parts/mainPage.html", true);
	xhttp.send();
}

function registerPerson() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		document.getElementById("maincontent").innerHTML = this.responseText
	}
	xhttp.open("GET", "/MarktWeb/parts/personRegistration.html", true);
	xhttp.send();
}

function submitPerson() {
	// stuur naar server
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var emailAdres = document.getElementById("emailAdres").value;
	var photo = document.getElementById("photo").value;

	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 204) {
			personRegistered();
		}

	}
	xhttp.open("POST", "/MarktWeb/rest/HelloWorld/person/1", true);
	xhttp.setRequestHeader("Content-Type", "application/json");
	xhttp.send(JSON.stringify({
		firstName : firstName,
		lastName : lastName,
		email : emailAdres,
		photo : photo
	}));
}

function personRegistered() {
	var text = "Dank voor uw registratie";
	document.getElementById("maincontent").innerHTML = '<p>Dank voor uw registratie</p>';
}

function registerItem() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		document.getElementById("maincontent").innerHTML = this.responseText
	}
	xhttp.open("GET", "/MarktWeb/parts/nieuwItem.html", true);
	xhttp.send();
}

function submitItem() {
	var titel = document.getElementById("titel").value;
	var omschrijving = document.getElementById("omschrijving").value;
	var foto = document.getElementById("foto").value;
	var prijs = document.getElementById("prijs").value;
	var status = document.getElementById("status").value;

	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var json = JSON.parse(this.responseText)
			itemRegistered(json);
		}
	}
	xhttp.open("POST", "/MarktWeb/rest/HelloWorld/item", true);
	xhttp.setRequestHeader("Content-Type", "application/json");
	xhttp.send(JSON.stringify({
		titel : titel,
		omschrijving : omschrijving,
		foto : foto,
		prijs : prijs,
		status : status,
	}));
}

function itemRegistered(item) {
	showItem(item)
//	document.getElementById("maincontent").innerHTML = '<p>Aanbieding is geplaatst!</p>';
}

function showItem(item) {
	var text = "<p>" + "Titel" + item.titel + " Omschrijving: "
			+ item.omschrijving
			+ " Foto: <img src=static/images/" + item.foto
			+ ".jpg" + " Prijs:" + item.prijs + " Status:"
			+ item.status + "</p>"
	document.getElementById("maincontent").innerHTML = text
}

function toonItems() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var json = JSON.parse(this.responseText)
			var text = ""
			for (var i = 0; i < json.length; i++) {
				text +=  "<p>" + "Titel " + json[i].titel + " Omschrijving: "
						+ json[i].omschrijving + " prijs:" + json[i].prijs + " Status:"
						+ json[i].status + "</p>" + " Foto: <img src=static/images/"  + json[i].foto + ".jpg>"
			}
		}
		document.getElementById("maincontent").innerHTML = text
	};
	xhttp.open("GET", "/MarktWeb/rest/HelloWorld/item", true);
	xhttp.send();
}
//else
//		text = "Fout, geen data opgehaald bij server"
//	} 


function toonPersons(){
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var json = JSON.parse(this.responseText)
			var text = ""
			for (var i = 0; i < json.length; i++) {
				text += "<p>" + "Voornaam: " + json[i].firstName
					+ " Achternaam:  " + json[i].lastName + " Email: "
					+ json[i].email + " Photo: <img src=static/images/"
					+ json[i].photo + ".jpg>" + "</p>"
			}
			document.getElementById("maincontent").innerHTML = text
		} else {
			text = "Server error"
		}
	};
	xhttp.open("GET", "/MarktWeb/rest/HelloWorld/person", true);
	xhttp.send();
}

function loadDoc() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		var text = ""
		if (this.readyState == 4 && this.status == 200) {
			var json = JSON.parse(this.responseText)

			for (var i = 0; i < json.length; i++) {
				text += "<p>" + "Titel" + json[i].titel + " Omschrijving: "
						+ json[i].omschrijving
						+ " Foto: <img src=static/images/" + json[i].foto
						+ ".jpg" + " Prijs:" + json[i].prijs + " Status:"
						+ json[i].status + "</p>"
			}
		}
		//	} else {
		// 	text = "Fout, geen data opgehaald bij server"
		//	} 
		document.getElementById("maincontent").innerHTML = text
	};
	xhttp.open("GET", "/MarktWeb/rest/HelloWorld/item/1", true);
	xhttp.send();
}