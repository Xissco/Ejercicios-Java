//
//Ejercicio 4.21
//Find the Smallest Number
//

import java.util.Scanner;

public class NumeroMasChico
{
	
	public static void main (String args[]) 
	{
		int counter;
		int number;
		int smallest;
		int limit;	
		Scanner Escan1 = new Scanner(System.in);
		
		System.out.println("Escriba le numero de valores a ser ingresados");
		limit=Escan1.nextInt();	
		
		number=Escan1.nextInt();
		smallest=number;	
		
		for (counter = 1; counter <= limit; counter++)
		{
			System.out.printf("\nIngese el valor #%d\n",counter);
			if (number<smallest)
			{
				smallest=number;
			}
			number=Escan1.nextInt();					
		}
		System.out.printf("El numero mas chico es %d\n\n",smallest);
			
	}
}
