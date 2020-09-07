package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	private List<Pelicula> lstPeliculas;

	//Sin parametros dentro del Constructor - Creamos las listas
	public Incaa() {
		this.lstPeliculas = new ArrayList<Pelicula>();;
	}

	// Agrego getters and setters
	public List<Pelicula> getLstPeliculas() {
		return lstPeliculas;
	}

	public void setLstPeliculas(List<Pelicula> lstPeliculas) {
		this.lstPeliculas = lstPeliculas;
	}

	
	// + agregarPelicula (String pelicula) : boolean, si la película existe en la
	// lista lanzar la excepción

	public boolean agregarPelicula(String pelicula) throws Exception {
		// Declaro For-Each
		for (Pelicula p : this.traerPelicula()) {
			if (p.getPelicula().equals(pelicula)) {
				throw new Exception("Error: La pelicula ya fue cargada");
			}
		}
		int idPelicula = 1;
		if (!lstPeliculas.isEmpty()) {
			idPelicula = lstPeliculas.get(lstPeliculas.size() - 1).getIdPelicula() + 1;
		}
		return lstPeliculas.add(new Pelicula(idPelicula, pelicula));
	}

	// Agrego este caso de uso que solamente devuelve la lista de peliculas para que
	// sea llamado en traerAuspiciante.

	public List<Pelicula> traerPelicula() {
		return this.lstPeliculas;
	}

	// + traerPelicula (int idPelicula) : Pelicula ,Si la película no existe
	// devolver null

	public Pelicula traerPelicula(int idPelicula) {

		Pelicula pelicula = null;

		for (Pelicula p : this.traerPelicula()) {
			if (p.getIdPelicula() == idPelicula) {
				pelicula = p;
			}
		}
		return pelicula;
	}

	// + traerPelicula (String partePelicula) : Pelicula //todas las películas que
	// contengan en su título el string partePelicula

	public Pelicula traerPelicula(String partePelicula) {

		Pelicula pelicula = null;

		for (Pelicula p : this.traerPelicula()) {
			if (p.getPelicula().equals(partePelicula)) {
				pelicula = p;
			}
		}
		return pelicula;
	}

	// Modificar la película traerPelicula por id, si no existe la película lanzar
	// la excepción, de lo contrario setPelicula con el parámetro pelicula .

	public void modificarPelicula(int idPelicula, String pelicula) throws Exception {
		Pelicula pelicula1 = traerPelicula(idPelicula);
		if (pelicula1 == null) {
			throw new Exception("Error: La pelicula no existe");
		} else {
			pelicula1.setIdPelicula(idPelicula);
			pelicula1.setPelicula(pelicula);
		}
	}

	// + eliminarPelicula (int idPelicula): boolean, Eliminar la película:
	// traerPelicula por su id, si no existe la película lanzar la excepción, de lo
	// contrario eliminar el elemento de la lista (remove)

	public boolean eliminarPelicula(int idPelicula) throws Exception {
		Pelicula pelicula = traerPelicula(idPelicula);
		if (pelicula == null) {
			throw new Exception("Error: La pelicula no existe");
		} else {
			lstPeliculas.remove(pelicula);
		}
		return true;
	}

}

