package Blog;
import java.text.DateFormat;
import java.util.Locale;

import BlogArticoli.Fantasy;
import BlogArticoli.Noir;
import BlogInterfacce.Blog;

public class BlogImpl implements Blog{
	private Articolo[] articoli;

	public BlogImpl(Articolo[] articoli) {
		setArticoli(articoli);
	}
	
	public BlogImpl() {}

	//GET
	
	public Articolo[] getArticoli() {
		return articoli;
	}
	
	//SET

	public void setArticoli(Articolo[] articoli) {
		this.articoli = articoli;
		for(int i=0; i<articoli.length; i++) {
			articoli[i].setId(i+1); }}
	
	
	//OVERRIDE - SINGOLI ARTICOLI


	@Override
	public String stampaArticoloPerId(int id) {
		String stampa =
				"\"!!! - ARTICOLO NON PRESENTE - !!!";
		
		boolean idArticolo = false;
		if(articoli != null) {
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			for(int i=0; i<articoli.length && !idArticolo; i++) {
				if(articoli[i].getId() == id) {
					stampa =
							"\nARTICOLO_"
							+ id
							+
							"\n\nTITOLO: "
							+ articoli[i].getTitolo()
							+
							"\nDATA: "
							+ df.format(articoli[i].getData()) 
							+
							"\nCATEGORIA: "
							+ articoli[i].getCategoria()
							+
							"\nTESTO: "
							+ articoli[i].getTesto()
							+
							"\nAUTORE: "
							+ articoli[i].getAutore()
							+
							"\nTAGS: "
							+ articoli[i].getTags();
					
					
							
					if(articoli[i] instanceof Noir) {
						stampa +=
								"\nDESCRIZIONE: "
								+ ((Noir)articoli[i]).getDescrizione();
						
					} else if(articoli[i] instanceof Fantasy) {
						stampa +=
								"\nDESCRIZIONE: "
								+ ((Fantasy)articoli[i]).getDescrizione();
					} else {
						stampa += "\n";
					}
					idArticolo = true;
					}}
					}
					return stampa;
					}
	

	//OVERRIDE - TUTTI GLI ARTICOLI

	
	@Override
	public String stampaArticoli() {
		String stampa =
				"\"!!! - ARTICOLO NON PRESENTE - !!!";
		
		if(articoli != null) {
			stampa = "";
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			for(int i=0; i<articoli.length; i++) {
				stampa +=
						"\n\n>----------------------------------------<\n"
						+	
						"\nARTICOLO_"
						+ articoli[i].getId()
						+
						"\n\nTITOLO: "
						+ articoli[i].getTitolo()
						+
						"\nDATA: "
						+ df.format(articoli[i].getData())
						+
						"\nCATEGORIA: "
						+ articoli[i].getCategoria()
						+
						"\nTESTO: "
						+ articoli[i].getTesto()
						+
						"\nAUTORE: "
						+ articoli[i].getAutore()
						+
						"\nTAGS: "
						+ articoli[i].getTags();
						
				if(articoli[i] instanceof Fantasy) {
					stampa += "\nDESCRIZIONE: "
				+ ((Fantasy)articoli[i]).getDescrizione();
					
				} else if(articoli[i] instanceof Noir) {
					stampa += "\nDESCRIZIONE: "

				+ ((Noir)articoli[i]).getDescrizione();
					
				} else {
					stampa += "\n";
					}}
					}
					return stampa;
					}

}