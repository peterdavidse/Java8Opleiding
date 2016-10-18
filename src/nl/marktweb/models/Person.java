package nl.marktweb.models;
import java.io.Serializable;
public class Person implements Serializable {
	//variabelen
	private static int aantalPersonenStart; // Teller aantal personen die zich hebben willen registreren
	private static int aantalPersonenRegistered; // Teller aantal personen waarvan de registratie is afgerond
	final private int personId;
	private String firstName;	//in eerste scrum
	private String lastName;    //in eerste scrum
	private String email;       //in eerste scrum
	private String adresStraat;
	private String adresHuisnummer;
	private String adresPlaats;
	private String adresLand;
	private String telefoonnummer;
	private char koper = 'N' ; // default geen koper apart koperId toevoegen?
	private char aanbieder = 'N';
	
	//methodes
	//getters
	public int getAantalPersonenStart(){
		return aantalPersonenStart;
	}
	public int getAantalPersonenRegistered(){
		return aantalPersonenRegistered;
	}
	public int getPersonId() {
		return personId;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getEmail(){
		return email;
	}
	public String getAdresSstraat(){
		return getAdresStraat();
	}
	public String getAdresHuisnummer(){
		return adresHuisnummer;
	}
	public String getAdresPlaats(){
		return adresPlaats;
	}
	public String getAdresLand(){
		return adresLand;
	}
	public String getTelefoonnummer(){
		return telefoonnummer;
	}
	//setters
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setEmail(String email){
		if (email.indexOf('@',0) > 0) //Er moet een @ in staan, en niet aan het begin
		{
		this.email = email;
		}
		else 
		{System.out.println("Fout in email. Pas het email adres aan.");}
	}
	//constructor
	public Person (String inFirstName, String inLastName) {
		aantalPersonenStart = aantalPersonenStart + 1; // Teller bij begin registratie (nog niet zeker dat registratie lukt)
		personId = aantalPersonenStart;
		setFirstName(inFirstName);
		setLastName(inLastName);
	}
	/**
	 * @param telefoonnummer the telefoonnummer to set
	 */
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public String getAdresStraat() {
		return adresStraat;
	}
	public void setAdresStraat(String adresStraat) {
		this.adresStraat = adresStraat;
	}
	public void setAdresHuisnummer(String adresHuisnummer) {
		this.adresHuisnummer = adresHuisnummer;
	}
	public void setAdresPlaats(String adresPlaats) {
		this.adresPlaats = adresPlaats;
	}
	public void setAdresLand(String adresLand) {
		this.adresLand = adresLand;
	}
	public char getKoper() {
		return koper;
	}
	public void setKoper(char koper) {
		this.koper = koper;
	}
	public char getAanbieder() {
		return aanbieder;
	}
	public void setAanbieder(char aanbieder) {
		this.aanbieder = aanbieder;
	}
	
		
}
