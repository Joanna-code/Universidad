package universidades;

import java.util.ArrayList;
/**
 * 
 *  @author Joanna
 *  Clase para crear facultades relacionadas a una universidad
 */

public class Facultad {
	
	private String nombre;
	ArrayList<Grado> grados = new ArrayList <>();
	Universidad universidad;

	//___________CONTRUCTOR _______________
	public Facultad(String nombre) {
		this.nombre = nombre;
	}
	
	//___________M�TODOS DE LA CLASE _______________
	
	/**
	 * @return el nombre de la facultad
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param establece el nombre de la facultad
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return la universidad
	 */
	public Universidad getUniversidad() {
		return universidad;
	}

	/**
	 * @param establecer universidad 
	 */
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	//M�todo para a�adir grado
	public void a�adirGrado (Grado grado) {
		grados.add(grado);
	
	}

}