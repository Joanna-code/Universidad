package universidades;

import java.util.ArrayList;
/**
 * 
 * @author Joanna
 * CLase para crear grados relacionados a una facultad.
 */

public class Grado {
	
	private String nombre;
	private String cod;
	Facultad facultad;
	
	ArrayList<Profesor> profesores = new ArrayList <>();
	ArrayList<Estudiante> estudiantes = new ArrayList<>();
	
	//___________CONTRUCTOR _______________
	
	public Grado(String nombre, String codigo) {
		this.nombre = nombre;
		this.cod = codigo;
	}

	//___________MÉTODOS DE LA CLASE _______________
	/**
	 * @return el nombre del grado
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param establece el nombre del grado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return el codigo del grado
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
	 * @return el nombre de la facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}
	
	/**
	 * @param establecer la facultad
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	//Método array para obtener los profesores del grado
	public void añadirProfesores(Profesor profesor){
		profesores.add(profesor);
	}
	//Método array para obtener los estudiantes del grado
	public void añadirEstudiantes(Estudiante estudiante){
		estudiantes.add(estudiante);
	}
	
}

