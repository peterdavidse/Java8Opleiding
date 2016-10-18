/**
 * 
 */
package nl.marktweb.models;

/**
 * @author Peter Davidse
 * oktober 2016, java 8 opleiding
 */
public class Item {

	/** Een Item kan worden aangeboden op de markt.
	 * 
	 */
	//variabelen
	private static int aantalItems;
	private int itemId; // moet uniek zijn
	private String Titel;
	private String Omschrijving;
	// TODO private XXXX Foto; ;
	private Double prijs;
	private int aanbiederId = -10; // geinitialiseerd op -10, echte aanbiederId nog niet bekend
	private int status; // 0 = default bij aanmaken, 1 = in aanbieding , 2 = verkocht  
	//methodes
	//constructor
	public Item() {
		aantalItems ++= ; // verhoogd aantalItems in de klasse met 1
		itemId = aantalItems; //gebruikt het aantalItems als id voor dit item
	}
	//getters en setters
	public int getItemId() {
		return itemId;
	}
	public String getTitel() {
		return Titel;
	}
	public void setTitel(String titel) {
		Titel = titel;
	}
	public String getOmschrijving() {
		return Omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		Omschrijving = omschrijving;
	}
	public Double getPrijs() {
		return prijs;
	}
	public void setPrijs(Double prijs) throws Exception {
		try
		{this.prijs = prijs;
		}
		catch (Exception e)
		{System.out.println("De ingevoerde prijs is fout.");
		}
	}
	public int getAanbiederId() {
		return aanbiederId;
	}
	public void setAanbiederId(int aanbiederId) {
		this.aanbiederId = aanbiederId;
	}
}
