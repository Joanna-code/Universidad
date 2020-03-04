package universidades;

import java.util.ArrayList;
/**
 * 
 * @author Joanna
 * 
 */

public class Universidad {
	
	//tiene q lleva el array de universidad
	
	//___________ATRIBUTOS DE LA CLASE _______________
	
	private String nombre;

	ArrayList<Facultad> facultades = new ArrayList<>(); 
	ArrayList<Estudiante> estudiantes = new ArrayList<>();


	//___________CONTRUCTOR _______________
	
	public Universidad (String nombre) {
		this.nombre = nombre;
		
	}
	
	//___________MÉTODOS DE LA CLASE _______________
	/**
	 * @return el nombre de la universidad
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param establece el nombre de la universidad
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//Método array para obtener las facultades que tiene la universidad
	public void añadirFacultades(Facultad facultad){
		facultades.add(facultad);

	}

	//Método array para obtener los estudiantes que tiene la universidad
	public void añadirEstudiantes(Estudiante estudiante){
		estudiantes.add(estudiante);
	
	}


}
