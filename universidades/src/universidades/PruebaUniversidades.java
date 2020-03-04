package universidades;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * 
 * @author Joanna
 * Clase con menú, del cuál usuario podrá escoger lo que desea hacer
 */

public class PruebaUniversidades {
	
	public static ArrayList<Universidad> universidades = new ArrayList<Universidad>();
	
	public static void main(String[] args) {

		boolean salir = false; //Controla el bucle del menú
		String nl = System.getProperty("line.separator");
		int menu;

		 while (salir != true) {
			 try {
			String entrada = JOptionPane.showInputDialog(null,"SISTEMA DE GESTIÓN UNIVERSITARIO"+nl+nl
										+ "1. Dar de alta una universidad"+nl
										+ "2. Matricular un estudiante en una universidad"+nl
										+ "3. Añadir facultad a una universidad"+nl
										+ "4. Añadir un grado a una facultad"+nl
										+ "5. Matricular un alumno en un grado"+nl
										+ "6. Asignar un profesor a un grado"+nl
										+ "7. Listar el alumnado que estudia en una universidad"+nl
										+ "8. Listar las facultades que forman parte de una universidad"+nl
										+ "9. Listar los grados que forman parte de una universidad"+nl
										+ "10. Listar el alumnado matriculado en un grado"+nl
										+ "11. Listar los profesores que imparten clases en un grado"+nl
										+ "12. Listar las universidades dadas de alta en el sistema"+nl
										+ "13. Salir"+nl+nl
										+ "Ingrese opción: ");
			menu = Integer.valueOf(entrada);
			
			switch(menu) {
			
			// Dar de alta una universidad 
				case 1:
					Universidad  universidad;
					String nombreUni;
					nombreUni = JOptionPane.showInputDialog("Introduce nombre: ");
					universidad = new Universidad(nombreUni);
					universidades.add(universidad);
					break;
					
			//Matricular un estudiante en una universidad 
				case 2:
					Estudiante estudiante;
					String nombreEstudiante;
					String codigoEstudiante;
					nombreEstudiante = JOptionPane.showInputDialog("Introduce nombre del Estudiante: ");
					codigoEstudiante = JOptionPane.showInputDialog("Código del Estudiante: ");
					estudiante = new Estudiante(nombreEstudiante, codigoEstudiante);
					//estudiantes.add(estudiante); asignar a la universidad
					break;
					
			//Añadir facultad a una universidad
				case 3:
					Facultad facultad;
					String nombreFacultad;
					nombreFacultad = JOptionPane.showInputDialog("Introduce el nombre de la Facultad: ");
					facultad = new Facultad (nombreFacultad);
					//facultades.add(Facultad); asignar a la universidad
					break;
					
			//Añadir un grado a una facultad
				case 4:
					Grado grado;
					String nombreGrado;
					String codigoGrado;
					nombreGrado = JOptionPane.showInputDialog("Introduce el nombre del Grado: ");
					codigoGrado = JOptionPane.showInputDialog("Código del Grado: ");
					grado = new Grado (nombreGrado, codigoGrado);
					//grados.add(grado); asignarle facultad
					break;
					
			//Matricular un alumno en un grado
				case 5:
					Estudiante alumno;
					String nombreAlumno;
					String codigoAlumno;
					nombreAlumno = JOptionPane.showInputDialog("Introduce nombre del Alumno: ");
					codigoAlumno = JOptionPane.showInputDialog("Código del Alumno: ");
					estudiante = new Estudiante(nombreAlumno, codigoAlumno);
					//estudiantes.add(estudiante); asignar al grado
					break;
					
			//Asignar un profesor a un grado
				case 6:
					Profesor profesor;
					String nombreProfe;
					String codigoProfe;
					nombreProfe = JOptionPane.showInputDialog("Nombre del profesor: ");
					codigoProfe = JOptionPane.showInputDialog("Codigo del profesor: ");
					profesor = new Profesor(nombreProfe, codigoProfe);
					//profesores.add(profesor); asignar al grado
					break;
					
			//Listar el alumnado que estudia en una universidad
				case 7:
					break;
					
			//Listar las facultades que forman parte de una universidad
				case 8:
					break;
					
			//Listar los grados que forman parte de una universidad
				case 9:
					break;
					
			//Listar el alumnado matriculado en un grado
				case 10:
					break;
					
			//Listar los profesores que imparten clases en un grado
				case 11:
					break;
					
			//Listar las universidades dadas de alta en el sistema
				case 12:
					// 
					/*
					for (Universidad u: universidad) {
						 for (Facultad f : u.facultades) {
							 for (Grado g: f.grados) {
								if (g.getNombre(g.equal(grados))) {
									 
								 }
							 }
						 }
					}
					*/
					break;
					
			// Salir del programa
				case 13:
					salir = true; //sale del menú
					JOptionPane.showMessageDialog(null, "Ha salido del menú");
					break; 
	              
				default:
					JOptionPane.showMessageDialog(null, "Opción incorrecta.");
					break;
				}
			
		 }catch (NumberFormatException e){
			 JOptionPane.showMessageDialog(null, "Opción incorrecta.");
		 }
			 
		 }

	}

}








