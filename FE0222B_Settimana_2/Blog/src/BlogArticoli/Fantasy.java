package BlogArticoli;

import Blog.Articolo;
import Blog.Tags;

public class Fantasy extends Articolo {
	
	private String descrizione;
	
	public Fantasy(int id, String titolo, String testo, Tags tags) {
		super(id, titolo, "Fantasy", testo, null, tags);
		this.setDescrizione(
				"Il Mago di Bruzer scopre di avere un fratello malvagio");
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}