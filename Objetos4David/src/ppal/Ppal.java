package ppal;

import java.util.Scanner;

import clases.Genero;
import clases.Pelicula;

public class Ppal {

	public static void main(String[] args) {
		
		Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough",
				Genero.CIENCIAFICCION, 191, 1982, 8.1);
		
		Pelicula pelicula2 = new Pelicula("Thor", "Keneth Branagh", 
				Genero.ACCION, 115, 2011, 7);
		
		if (pelicula1.esPeliculaEpica()) {
			System.out.printf("LA pelicula %s es una pelicula épica."
					,pelicula1.getNombre());
		} else {
			System.out.printf("LA pelicula %s NO es una pelicula épica."
					,pelicula1.getNombre());
		}
		
		if (pelicula2.esPeliculaEpica()) {
			System.out.printf("LA pelicula %s es una pelicula épica."
					,pelicula2.getNombre());
		} else {
			System.out.printf("LA pelicula %s NO es una pelicula épica."
					,pelicula2.getNombre());
		}
		
		if (pelicula1.esSimilar(pelicula2) ) {
			System.out.println("Las dos peliculas son similares");
		} else {
			System.out.println("Las dos peliculas NO son similares");
		}

		System.out.println("Pelicula 1: "+pelicula1);
		System.out.println("Pelicula 2: "+pelicula2);
		
		System.out.println("EL género de la pelicula 1 es "
				+pelicula1.getGenero());
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el género: ");
		String gen = teclado.nextLine();
		
		Genero genPelicula3 = Genero.getGenero(gen);
		
		Pelicula pelicula3 = new Pelicula("Otar", "Uno",
				genPelicula3, 191, 1982, 8.1);
		
	
	}

}
