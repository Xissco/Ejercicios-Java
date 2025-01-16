//
//Ejercicio 5.13
//Factorials
//

public class Factorial 
{
	
	public static void main (String args[]) 
	{
		int n=20;
		long fac=n;
		
		for (long con=n-1 ; con >1 ; con--)
		{		
			fac=fac*con;
		}
				
		System.out.printf("El factorial de 20 es: %d\n\n",fac); 		
	}
}
