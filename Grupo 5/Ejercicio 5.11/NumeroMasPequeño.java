//
//Ejercicio 4.21
//Find the Smallest Number
//

import java.util.Scanner;

public class NumeroMasPequeño
{
	
	public static void main (String args[]) 
	{
		int counter;
		int number;
		int largest=0;	
		Scanner Escan1 = new Scanner(System.in);
		
		System.out.println("Escriva le numero de valores a ser ingresados");
		limit=escan1.nextInt();		
		
		for (counter = 1; counter <= limit; counter++)
		{
			System.out.printf("\nIngese el valor #%d\n",counter);
			number=Escan1.nextInt();
			if (number>largest)
			{
				largest=number;
			}					
		}
		System.out.printf("El numero mas grande es %d\n\n",largest);
			
	}
}
