//
//Ejercicio 4.21
//Find the Largest Number
//

import java.util.Scanner;

public class NumeroMasGrande
{
	
	public static void main (String args[]) 
	{
		int counter;
		int number;
		int largest=0;	
		Scanner Escan1 = new Scanner(System.in);
		
		for (counter = 1; counter <= 10; counter++)
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
