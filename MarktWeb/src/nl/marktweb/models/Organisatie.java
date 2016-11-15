package nl.marktweb.models;

public class Organisatie {
	int SoortRelatie; //1 = persoon, 2 = organisatie 
	String firstName;
	String lastName;
	String email;
	IBAN bankrekeningnrSEPA; //TODO IBAN klasse 
	public static void main(String[] args) {
		Organisatie DeVerkopers = new Organisatie();
//		DeVerkopers.name = "De Verkopers";
//		System.out.println(DeVerkopers.name);
	}
}

class IBAN {
	private static String reknr;
//	enum landiso2; // alleen bij verificatie?
	public static void main(String[] args) {};

	private static String buildIBAN(String ibanIn) {
	 reknr = ibanIn;
	 return null;
	//TODO Hier de code om het IBAN samen te stellen uit deelgegevens??
	// waarom zou je dit doen, je vraagt de IBAN van de relatie.
	// of verify Verify IBAN
	}

}