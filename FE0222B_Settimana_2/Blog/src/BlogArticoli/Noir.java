package BlogArticoli;

import Blog.Articolo;
import Blog.Tags;

public class Noir extends Articolo {

	private String descrizione;

	public Noir(int id, String titolo, String testo, Tags tags) {
		super(id, titolo, "Noir", testo, null, tags);
		this.setDescrizione(
				"Il Detective Bob ha ricevuto un caso tutt'altro che semplice.");
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}