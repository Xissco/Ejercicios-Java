//
//Ejercicio 5.24
//Diamond Printing Program
//

import java.util.Scanner;

public class DiamanteN
{	
		public static String a(int n)
	{
		String as="";
		
		for (int i = 1; i <=n ; i++)
		{
			as=as+"*";
		}
		
		return as;		
	}
	
		public static String e(int n)
	{
		String es=" ";
		
		for (int i = 1; i <=n ; i++)
		{
			es=es+"#";
		}
		
		return es;		
	}
	
	public static void main (String args[]) 
	{
		String a="";
		String e="";
		int n;
		int con;
		int as;
		Scanner Scan1 = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de filas del diamante");
		n=as=Scan1.nextInt();
		con=(n-n/2)-1;	
		System.out.println();	
		
		if (n%2==0)
		{
			as=n-1;
		}		 
		
		for (int i = 1; i <= as; i=i+2)
		{
			e=e(con);
			a=a(i);
			con--;
			System.out.printf("%s %s%s",e,a,e);
			System.out.println();			
			
		}
		
		if (n%2==0)
		{
			con=0;
			as=n-1;
		}	
		else
		{
			con=1;
			as=n-2;
		}		
		
		for (int i = as; i >= 1; i=i-2)
		{
			e=e(con);
			a=a(i);
			con++;
			System.out.printf("%s %s%s",e,a,e);
			System.out.println();				
		}
		System.out.println();				
	}
}
