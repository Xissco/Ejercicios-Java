//
//Ejercicio 5.15
//Triangle Printing Program
//

public class Triangulo
{	
	public static void main (String args[]) 
	{
		//FIGURA A
		System.out.printf("(a)\n\n");
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= i ; j++)
			{
				System.out.print("*");				
			}
			System.out.println();					
		}
		System.out.println();	
		
		//FIGURA B
		System.out.printf("(b)\n\n");
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 10; j >= i ; j=j-1)
			{
				System.out.print("*");				
			}
			System.out.println();					
		}
		System.out.println();
		
		//FIGURA C
		
		System.out.printf("(C)\n\n");
		for (int i = 1; i <= 10; i++)
		{			
			for (int j = 2; j <= i ; j++)
			{
				System.out.print(" ");				
			}
			for (int k = 10; k >= i ; k--)
			{
				System.out.print("*");				
			}	
			System.out.println();										
		}
		System.out.println();
		
		//FIGURA D
		
		System.out.printf("(C)\n\n");
		for (int i = 1; i <= 10; i++)
		{			
			for (int k = 10; k >= i  ; k--)
			{
				System.out.print(" ");				
			}	
			for (int j = 1; j <= i ; j++)
			{
				System.out.print("*");				
			}			
			System.out.println();										
		}
		System.out.println();
					
	}
}
