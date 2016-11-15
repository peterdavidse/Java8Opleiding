package nl.marktweb.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "Person")

public class Person implements Serializable {
	
	@Id
	@SequenceGenerator(name = "PersonSequence", sequenceName = "Person_Item")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PersonSequence")
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String photo;
		
	public Person() {}
	
	public Person(String aFirstName, String aLastName) {
		setFirstName(aFirstName);
		setLastName(aLastName);
	}
	
	public Person(String aFirstName, String aLastName, String anEmail) {
		setFirstName(aFirstName);
		setLastName(aLastName);
		setEmail(anEmail);
	}
	
	public Person(String aFirstName, String aLastName, String anEmail, String aPhoto) {
		setFirstName(aFirstName);
		setLastName(aLastName);
		setEmail(anEmail);
		setPhoto(aPhoto);
	}
	
	private Long getid() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
	        return "Person id: " + getid() + " Voornaam: " + getFirstName() + " Achternaam " + getLastName() + "Emailadres "+ getEmail();
	    }

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String aPhoto) {
		this.photo = aPhoto;
	}
	
}
