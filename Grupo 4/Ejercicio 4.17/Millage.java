//
//Ejercicio 4.17
//Gas Mielage
//

import java.util.Scanner; 

public class Millage 
{
	
	public static void main (String args[]) 
	{
		int gas;
		int millas; 
		double msg;
		double msgt=0;
		Scanner Escan1 = new Scanner(System.in);
		
		System.out.println("El ingreso de datos comenzara presione Ctrl + D para finalizarlo");
		System.out.printf("\nEsciba las millas viajadas\n");
		
		while (Escan1.hasNext())
		{
			millas = Escan1.nextInt();
			System.out.printf("\nEscriba los galones utilizados\n");
			gas = Escan1.nextInt();
			msg=((double) millas/gas);
			System.out.printf("\nLas millas por galon son: %.2f\n",msg);
			msgt+=msg;
			System.out.println("\nEsciba las millas viajadas o presione presione Ctrl+D para finalizar el ingreso de datos");   
		}
		
		System.out.printf("\nLas millas por galon totales son: %.2f\n",msgt);
		    
	}
}
