/**
 * 
 */
package nl.marktweb.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Peter Davidse
 * oktober 2016, java 8 opleiding
 */
@Entity
@Table (name = "Item")
public class Item  implements Serializable{

	/** Een Item kan worden aangeboden op de markt.
	 * 
	 */
	@Id
	@SequenceGenerator(name = "MarktSequence", sequenceName = "Markt_Item")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="MarktSequence")
	//variabelen
	private int Id; // moet uniek zijn
	private String titel;
	private String omschrijving;
	private String foto;
	private Double prijs;
	private String status; // in aanbieding , verkocht  
	//methodes

	//getters en setters
	public int getId() {
		return Id;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String atitel) {
		 titel = atitel;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String anOmschrijving) {
		omschrijving = anOmschrijving;
	}
	public Double getPrijs() {
		return prijs;
	}
	public void setPrijs(Double aPrijs) throws Exception {
		try
		{prijs = aPrijs;
		}
		catch (Exception e)
		{System.out.println("De ingevoerde prijs is fout.");
		}
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String astatus) {
		status = astatus;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String afoto) {
		foto = afoto;
	}
	}
