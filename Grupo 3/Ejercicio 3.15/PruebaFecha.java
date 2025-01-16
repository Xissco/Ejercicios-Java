//
//Ejercicio
//{Introduccion}
//

import java.util.Scanner;  

public class PruebaFecha
{
	
	public static void main (String args[]) 
	{
		Scanner Escan1 = new Scanner(System.in);
		Fecha Fecha1 = new Fecha(01,01,1970);
		
		Fecha1.ShowF();
		
		System.out.println("Ingrese el mes");
		int mes=Escan1.nextInt();
		Fecha1.setmes(mes);
		
		System.out.println("Ingrese el dia");
		int dia=Escan1.nextInt();
		Fecha1.setdia(dia);
		
		System.out.println("Ingrese el año");
		int year=Escan1.nextInt();
		Fecha1.setyear(year);
		
		Fecha1.ShowF();		 
	}
}
