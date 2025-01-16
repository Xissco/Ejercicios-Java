//
//Ejercicio 3.11
//Modified GradeBook Class
//

import java.util.Scanner;

public class PruebaLibroDeCalificaciones
{
	
	public static void main (String args[]) 
	{
		Scanner Escan1 = new Scanner(System.in);
		LibroDeCalificaciones MiLibro1 = new LibroDeCalificaciones("Computacion","Patricio");
		
		System.out.printf("Nombre del Curso: \n%s\n",MiLibro1.getNombreDelCurso());
		System.out.println();
		System.out.printf("Presentado por: \n%s\n",MiLibro1.getNombreDelProfesor());
		System.out.println();
		
		System.out.println("Escriba el nombre del curso:");
		String NameC = Escan1.nextLine();
		MiLibro1.setNombreDelCurso(NameC);
		System.out.println();
		
		System.out.println("Escriba el nombre del profesor:");
		String NameP = Escan1.nextLine();
		MiLibro1.setNombreDelProfesor(NameP);
		System.out.println();
		
		MiLibro1.ShowM();
	}
}

