package modelo;

import java.util.List;

public class Incaa {
	private List<Pelicula> lstPeliculas;

	public Incaa(List<Pelicula> lstPeliculas) {
		super();
		this.lstPeliculas = lstPeliculas;
	}

	public List<Pelicula> getLstPeliculas() {
		return lstPeliculas;
	}

	public void setLstPeliculas(List<Pelicula> lstPeliculas) {
		this.lstPeliculas = lstPeliculas;
	}

}
	
	  /*
	    Casos de uso :
		+ agregarPelicula (String pelicula) : boolean
		Si la película existe en la lista lanzar la excepción
		
		+ traerPelicula (int idPelicula) : Pelicula
		Si la película no existe devolver null
		
		+ traerPelicula (String partePelicula) : Pelicula //todas las películas que contengan en su
		título el string partePelicula
		
		+ modificarPelicula (int idPelicula, String pelicula) :
		Modificar la película traerPelicula por id, si no existe la película lanzar la excepción, de lo
		contrario setPelicula con el parámetro pelicula .
		
		+ eliminarPelicula (int idPelicula): boolean
		Eliminar la película: traerPelicula por su id, si no existe la película lanzar la excepción, de lo
		contrario eliminar el elemento de la lista (remove)
	 */

