package Blog;
import java.util.Scanner;

import BlogArticoli.Fantasy;
import BlogArticoli.Noir;


public class MainClass {

	public static void main(String[] args){
		Autore autore_1 = new Autore(1, "Adam", "Losio");
		Autore autore_2 = new Autore(2, "Matteo", "Losio");
		
		Articolo articolo_1 = autore_1.scriviArticolo
				("La tavola giapponese", "Cucina", "Il Giappone pè famoso per il Sushi, Ramen e Sakè.",
						new Tags(new String[] {"Viaggio", "Cucina", "Esperienze"}));
		
		Articolo articolo_2 = autore_2.scriviArticolo
				("La tavola Milanese", "Cucina", "Polenta o cotoletta alla milanese? Bhe...",
						new Tags(new String[] {"Viaggio", "Cucina", "Esperienze"}));
		
		Articolo articolo_3 = new Fantasy
				(0, "Il Mago di Bruzer", "Il Mago di Bruzer scopre di avere un fratello malvagio.",
						new Tags(new String[] {"Fantasy", "Mistico", "Animali"}));
		
		autore_1.scriviArticolo(articolo_3);

		Articolo articolo_4 = new Noir
				(0, "Il dente di Serpente", "Il Detective Bob ha ricevuto un caso tutt'altro che semplice.",
						new Tags(new String[] {"Azione", "Supence", "Delitto"}));
		
		autore_2.scriviArticolo(articolo_4);
		
		Articolo[] articoli = {articolo_1, articolo_2, articolo_3, articolo_4};

		
		BlogImpl blog = new BlogImpl(articoli);
		System.out.println(
				"QUESTA SETTIMANA HAI A DISPOSIZIONE "
				+ blog.getArticoli().length
				+ " ARTICOLI:" + "\n \n"
				+ "1) La tavola giapponese" + "\n \n"
				+ "2) La tavola milanese" + "\n \n"
				+ "3) Il Mago di Bruzer" + "\n \n"
				+ "4) Il dente di Serpente"
				+ "\n \n>----------------------------------------<\n");
		
		
		//SCANNER
		
		
		Scanner scanner = new Scanner(System.in);
		if(blog.getArticoli().length != 0) {			
			int input = -1;
			do {
				System.out.println(
					"COSA DESIDERI LEGGERE?" + "\n \n"
					+ "[0] Stampa tutti gli articoli"
					+ "\n[1] Stampa l'articolo corrispondente");
				
				input = Integer.parseInt(scanner.nextLine());
				if(input == 0) { System.out.println(blog.stampaArticoli());
				} else if(input == 1) { System.out.println(
						"Inserisci il NUMERO dell'articolo che vuoi leggere");
				
					int id = Integer.parseInt(scanner.nextLine());
				do {
					if(!idPresente(id, blog)) { System.out.println(
							"!!! - ARTICOLO NON PRESENTE - !!!" + " I numeri vanno da 0 a 4");
						break;
					} else { System.out.println(blog.stampaArticoloPerId(id));
						break;
					}} while (!idPresente(id, blog));
					}} while (input != 0 && input != 1);
					} else { System.out.println(
							" !!! - ARTICOLO NON PRESENTE QUESTA SETTIMANA - !!!");
					scanner.close();
					}}

	static boolean idPresente(int id, BlogImpl blog) {
		boolean idArticolo = false;
		for(int i=0; i<blog.getArticoli().length && !idArticolo; i++) {
			if(blog.getArticoli()[i].getId() == id) {
				idArticolo = true;
			}}
				return idArticolo;
			}}