package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	private List<Pelicula> catalogo;

	//Sin parametros dentro del Constructor - Creamos las listas
	public Incaa() {
		this.catalogo = new ArrayList<Pelicula>();;
	}

	// Agrego getters and setters
	public List<Pelicula> getLstPeliculas() {
		return catalogo;
	}

	public void setLstPeliculas(List<Pelicula> lstPeliculas) {
		this.catalogo = lstPeliculas;
	}

	
	// + agregarPelicula (String pelicula) : boolean, si la pel�cula existe en la
	// lista lanzar la excepci�n

	public boolean agregarPelicula(String pelicula) throws Exception {
		// Declaro For-Each
		for (Pelicula p : this.traerPelicula()) {
			if (p.getPelicula().equals(pelicula)) {
				throw new Exception("Error: La pelicula ya fue cargada");
			}
		}
		int idPelicula = 1;
		if (!catalogo.isEmpty()) {
			idPelicula = catalogo.get(catalogo.size() - 1).getIdPelicula() + 1;
		}
		return catalogo.add(new Pelicula(idPelicula, pelicula));
	}
	
	public boolean agregarPelicula(String pelicula, Genero genero) throws Exception {
		// Declaro For-Each
		for (Pelicula p : this.traerPelicula()) {
			if (p.getPelicula().equals(pelicula)) {
				throw new Exception("Error: La pelicula ya fue cargada");
			}
		}
		int idPelicula = 1;
		if (!catalogo.isEmpty()) {
			idPelicula = catalogo.get(catalogo.size() - 1).getIdPelicula() + 1;
		}
		return catalogo.add(new Pelicula(idPelicula, pelicula, genero));
	}

	// Agrego este caso de uso que solamente devuelve la lista de peliculas para que
	// sea llamado en traerAuspiciante.

	public List<Pelicula> traerPelicula() {
		return this.catalogo;
	}

	// + traerPelicula (int idPelicula) : Pelicula ,Si la pel�cula no existe
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
	
	//Sobrecarga de metodo
	public Pelicula traerPelicula(Genero genero) {

		Pelicula pelicula = null;

		for (Pelicula p : this.traerPelicula()) {
			if (p.getGenero() == genero) {
				pelicula = p;
			}
		}
		return pelicula;
	}

	// + traerPelicula (String partePelicula) : Pelicula //todas las pel�culas que
	// contengan en su t�tulo el string partePelicula

	public Pelicula traerPelicula(String partePelicula) {

		Pelicula pelicula = null;

		for (Pelicula p : this.traerPelicula()) {
			if (p.getPelicula().equals(partePelicula)) {
				pelicula = p;
			}
		}
		return pelicula;
	}

	// Modificar la pel�cula traerPelicula por id, si no existe la pel�cula lanzar
	// la excepci�n, de lo contrario setPelicula con el par�metro pelicula .

	public void modificarPelicula(int idPelicula, String pelicula) throws Exception {
		Pelicula pelicula1 = traerPelicula(idPelicula);
		if (pelicula1 == null) {
			throw new Exception("Error: La pelicula no existe");
		} else {
			pelicula1.setIdPelicula(idPelicula);
			pelicula1.setPelicula(pelicula);
		}
	}

	// + eliminarPelicula (int idPelicula): boolean, Eliminar la pel�cula:
	// traerPelicula por su id, si no existe la pel�cula lanzar la excepci�n, de lo
	// contrario eliminar el elemento de la lista (remove)

	public boolean eliminarPelicula(int idPelicula) throws Exception {
		Pelicula pelicula = traerPelicula(idPelicula);
		if (pelicula == null) {
			throw new Exception("Error: La pelicula no existe");
		} else {
			catalogo.remove(pelicula);
		}
		return true;
	}

}

