package universidades;
/**
 * 
 * @author Joanna
 * Clase para registrar a todos los profesores de un grado
 */

public class Profesor {
	
	//___________ATRIBUTOS DE LA CLASE _______________
	private String nombre;
	private String cod;
	
	Grado grado;
	
	//___________CONTRUCTOR _______________
	
	public Profesor (String nombre, String codigo) {
		this.nombre = nombre;
		this.cod = codigo;
	}
	//___________MÉTODOS DE LA CLASE _______________
	
	/**
	 * @return el nombre del profesor
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param establecer el nombre del profesor
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el codigo
	 */
	public String getCod() {
		return cod;
	}

	/**
	 * @param establece el codigo
	 */
	public void setCod(String cod) {
		this.cod = cod;
	}

	/**
	 * @return devuelve el nombre del grado
	 */
	public Grado getG() {
		return grado;
	}
	
	/**
	 * @param establece el nombre del grado
	 */
	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	
	

}

