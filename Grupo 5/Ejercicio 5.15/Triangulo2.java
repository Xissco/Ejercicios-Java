//
//Ejercicio 5.15
//Triangle Printing Program)
//

public class Triangulo2
{
	public static String a(int n)
	{
		String as="*";
		
		for (int i = 1; i <=n-1 ; i++)
		{
			as=as+"*";
		}
		
		return as;		
	}
		
	public static void main (String args[]) 	
	{	
		String a;
		String b;
			
		for (int i = 1; i <=10 ; i++)
		{
		a=a(i);		 
		b=a(11-i);		
		System.out.printf("%-15s%-15s%10s%15s",a,b,a,b);
		System.out.println();				
		}
		
	}
}
