package test;

import modelo.Incaa;

public class testModelo {

	public static void main(String[] args) throws Exception {

		//Pelicula pelicula = new Pelicula();
		
		Incaa incaa = new Incaa();
		
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
