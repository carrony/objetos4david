package clases;

public enum Genero {
	ACCION(0, "Acción"), COMEDIA(1, "Comedia"), 
	DRAMA(2,"Drama"), SUSPENSO(3,"SUSPENSO"), 
	CIENCIAFICCION(4, "Ciencia Ficción"), ERROR(5,"Error");

	private int id;
	private String nombre;

	
	Genero(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static Genero getGenero(String nombre) {
		switch(nombre.toLowerCase()) {
		case "acción": return ACCION;
		case "comedia": return COMEDIA;
		case "drama": return DRAMA;
		case "suspenso": return SUSPENSO;
		case "ciencia ficción": return CIENCIAFICCION;
		default: return ERROR;
		}
	}
	
	
	
	
}
