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
		Si la pel�cula existe en la lista lanzar la excepci�n
		
		+ traerPelicula (int idPelicula) : Pelicula
		Si la pel�cula no existe devolver null
		
		+ traerPelicula (String partePelicula) : Pelicula //todas las pel�culas que contengan en su
		t�tulo el string partePelicula
		
		+ modificarPelicula (int idPelicula, String pelicula) :
		Modificar la pel�cula traerPelicula por id, si no existe la pel�cula lanzar la excepci�n, de lo
		contrario setPelicula con el par�metro pelicula .
		
		+ eliminarPelicula (int idPelicula): boolean
		Eliminar la pel�cula: traerPelicula por su id, si no existe la pel�cula lanzar la excepci�n, de lo
		contrario eliminar el elemento de la lista (remove)
	 */

