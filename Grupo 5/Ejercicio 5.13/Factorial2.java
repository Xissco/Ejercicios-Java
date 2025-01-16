//
//Ejercicio 5.13
//Factorials
//

import java.text.DecimalFormat;

public class Factorial2 
{
	
	public static void main (String args[]) 
	{
		int n=20;
		long fac=n;
		DecimalFormat NC = new DecimalFormat("00.000000E0");
		
		for (long con=n-1 ; con >1 ; con--)
		{		
			fac=fac*con;
		}
				
		System.out.print("El factorial de 20 es: " );
		System.out.println(NC.format(fac));	
		System.out.println();
	}
}
