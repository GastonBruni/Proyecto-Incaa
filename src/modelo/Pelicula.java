package modelo;

public class Pelicula {

	private int idPelicula;
	private String pelicula;

	public Pelicula(int idPelicula, String pelicula) {
		super();
		this.idPelicula = idPelicula;
		this.pelicula = pelicula;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

}
