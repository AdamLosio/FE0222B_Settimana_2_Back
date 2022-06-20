package Blog;

import BlogInterfacce.Scrittore;

public class Autore implements Scrittore{
	private int id;
	private String nome;
	private String cognome;
	
	public Autore(
		int id,
		String nome,
		String cognome
		)
	{
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}
	

	//GETTER

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome; 
	}

	public String getCognome() {
		return cognome;
	}
	

	//SETTER

	
	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
	//OVERRIDE - SCRIVI ARTICOLO


	@Override
	public Articolo scriviArticolo(String titolo, String categoria, String testo,Tags tags) {
		Articolo newArticolo = new Articolo(0, titolo, categoria, testo, this, tags);
		return newArticolo; }
	
	@Override
	public Articolo scriviArticolo(Articolo articolo) {
		articolo.setAutore(this);
		return articolo; }
	
	@Override
	public String toString() {
		return nome + " " + cognome;
	}
	
}