//
//Ejercicio 4.20
//Salary Calculator
//

import java.util.Scanner;

public class CalcularSalario 
{
	
	public static void main (String args[]) 
	{
		String name;
		int numhourw;
		double costhour;
		
		Scanner Escan1 = new Scanner(System.in); 
		Salario Empleado1 = new Salario("Mary Sue",40,1.56);
		
		System.out.println("Ingrese el nombre del empleado");
		
		while (Escan1.hasNext())
		{
			name = Escan1.nextLine();
			Empleado1.setname(name);
			System.out.println("Ingrese las horas trabajadas");
			numhourw = Escan1.nextInt();
			Empleado1.setnumhour(numhourw);
			System.out.println("Ingrese el costo de 1 hora");
			costhour = Escan1.nextDouble();
			Empleado1.setcosthor(costhour);
			System.out.printf("%-15s%-15s%-15s%-15s\n\n","Nombre","H.Trabajadas","C.Hora","Salario");
		    Empleado1.ShowS();
		    System.out.println("Ingrese el nombre del empleado o Crtl+D para terminar el ingreso de datos");
			
		}
		
						
		System.out.printf("%-15s%-15s%-15s%-15s\n\n","Nombre","H.Trabajadas","C.Hora","Salario");
		Empleado1.ShowS();
		System.out.println();
		
		
	}
}
