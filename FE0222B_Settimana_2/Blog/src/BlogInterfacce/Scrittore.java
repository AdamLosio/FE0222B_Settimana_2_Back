package BlogInterfacce;
import Blog.Articolo;
import Blog.Tags;

public interface Scrittore {
	public Articolo scriviArticolo(String titolo, String categoria, String testo, Tags tags);
	public Articolo scriviArticolo(Articolo articolo);
}
