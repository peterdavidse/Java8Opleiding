/**
 * 
 */
package nl.marktweb.models;
import java.util.*;
/**
 * @author Peter Davidse
 * Oktober 2016, Java 8 opleiding
 * 
 */
public class Aanbieder {

	/**
	 * Een aanbieder kan één of meerdere items op de markt aanbieden.
	 */
	//variabelen
	private int aanbiederId;
	private String abNaam;
	private String personId;
	private ArrayList aangebodenItems;
	private ArrayList verkochteItems;
	// voor als er ook organisaties gaan aanbieden private String orgId;
	//methods
	//constructor
	public Aanbieder() {
		}

	public int getAanbiederId() {
		return aanbiederId;
	}

	public void setAanbiederId(int aanbiederId) {
		this.aanbiederId = aanbiederId;
	}

	public String getAbNaam() {
		return abNaam;
	}

	public void setAbNaam(String abNaam) {
		this.abNaam = abNaam;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ArrayList getAangebodenItems() {
		return aangebodenItems;
	}

	public void setAangebodenItems(ArrayList aangebodenItems) {
		this.aangebodenItems = aangebodenItems;
	}

	public ArrayList getVerkochteItems() {
		return verkochteItems;
	}

	public void setVerkochteItems(ArrayList verkochteItems) {
		this.verkochteItems = verkochteItems;
	}



}
