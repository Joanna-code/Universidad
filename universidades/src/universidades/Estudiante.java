package universidades;
/**
 * 
 * @author Joanna
 * Clase para matricular alumanos/estudiantes 
 */

public class Estudiante {

	private String nombre;
	private String cod;
	Universidad universidad;
	Grado grado;
	
	//___________CONTRUCTOR _______________
	public Estudiante(String nombre, String codigo) {
		this.cod = codigo;
		this.nombre = nombre;
	}

	//___________MÉTODOS DE LA CLASE _______________
	/**
	 * @return devuelve el nombre del estudiante
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param establece el nombre del estudiante
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return el código del estudiante
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
	 * @param Estable la universidad
	 */
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	/**
	 * @return el grado
	 */
	public Grado getGrado() {
		return grado;
	}

	/**
	 * @param se establece el grado
	 */
	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	/**
	 * @return la universidad
	 */
	public Universidad getUniversidad() {
		return universidad;
	}
	
}
