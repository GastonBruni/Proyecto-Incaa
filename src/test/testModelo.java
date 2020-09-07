package test;

import modelo.Genero;
import modelo.Incaa;

public class testModelo {

	public static void main(String[] args) throws Exception {

		//Pelicula pelicula = new Pelicula();
		
		Incaa incaa = new Incaa();
		/*
		incaa.agregarGenero("Terror");
		incaa.agregarGenero("Suspenso");
		incaa.agregarGenero("Accion");
		incaa.agregarGenero("Infantil");
		*/
		Genero generoT = new Genero(1, "Terror");
		Genero generoS = new Genero(2, "Suspenso");
		Genero generoA = new Genero(3, "Accion");
		Genero generoI = new Genero(4, "Infantil");

		incaa.agregarPelicula("La llorona",generoT);
		incaa.agregarPelicula("Karate Kid",generoA);
		incaa.agregarPelicula("SpiderMan",generoA);
		incaa.agregarPelicula("La guerra de los mundos",generoS);
		incaa.agregarPelicula("Scooby Doo",generoI);

		System.out.println(incaa.traerPelicula(generoT).toString2());
		System.out.println(incaa.traerPelicula(generoA).toString2());

		
		incaa.agregarPelicula("El robo del siglo");
		incaa.agregarPelicula("IT 2");
		incaa.agregarPelicula("El dia despues de mañana");
		incaa.agregarPelicula("Never back down");
		incaa.agregarPelicula("Shrek");
		
		System.out.println(incaa.traerPelicula().toString());
		
		incaa.modificarPelicula(2, "El guason");
		
		System.out.println(incaa.traerPelicula(2));
		
		incaa.eliminarPelicula(4);
		
		System.out.println(incaa.traerPelicula());
		
	}

}
