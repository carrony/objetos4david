package clases;

public class Pelicula {


	
	private String nombre;
	private String director;
	private Genero genero;
	private int duracion;
	private int anio;
	private double calificacion;
	
	
	public Pelicula(String nombre, String director, Genero genero, 
				    int duracion, int anio, double calificacion) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		setDuracion(duracion);
		this.anio = anio;
		setCalificacion(calificacion);
	}


	public String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDirector() {
		return director;
	}


	private void setDirector(String director) {
		this.director = director;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public int getDuracion() {
		return duracion;
	}


	private void setDuracion(int duracion) {
		if (duracion>0) {	
			this.duracion = duracion;
		}
	}


	public int getAnio() {
		return anio;
	}


	private void setAnio(int anio) {
		this.anio = anio;
	}


	public double getCalificacion() {
		return calificacion;
	}


	private void setCalificacion(double calificacion) {
		if (this.calificacion>=0 && this.calificacion<=10) {
			this.calificacion = calificacion;
		}
	}


	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", director=" + director 
				+ ", genero=" + genero + ", duracion=" + duracion
				+ ", anio=" + anio + ", calificacion=" + calificacion + "]";
	}
	
	public boolean esPeliculaEpica() {
		return this.duracion>=180;
	}
	
	private String calcularValoracion() {
		String valoracion="Muy mala";
		if (this.calificacion<=2) {
			valoracion="Muy mala"; 
		}else if (this.calificacion<=5) {
			valoracion="Mala";
		} else if (this.calificacion<=7) {
			valoracion="Regular";
		} else if (this.calificacion <=8) {
			valoracion="Buena";
		} else {
			valoracion= "Excelente";
		}
		return valoracion;
	}
	
	public boolean esSimilar(Pelicula p) {
		if (this.genero.equals(p.genero) && 
			this.calcularValoracion().equals(p.calcularValoracion())) {
			return true;
		}else {
			return false;
		}
		
//		return (this.genero.equals(p.genero) && 
//				this.calcularValoracion().equals(p.calcularValoracion()));	
	}
	
	
	
	
	
}
