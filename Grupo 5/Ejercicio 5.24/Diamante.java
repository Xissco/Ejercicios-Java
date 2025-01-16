//
//Ejercicio 5.24
//Diamond Printing Program
//

public class Diamante
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
	
		public static String e(int n)
	{
		String es="";
		
		for (int i = 1; i <=n ; i++)
		{
			es=es+" ";
		}
		
		return es;		
	}
	
	public static void main (String args[]) 
	{
		String a="";
		String e="";
		int con=5;	
		
		System.out.println();	
		
		for (int i = 1; i <= 9; i=i+2)
		{
			e=e(10-con);
			a=a(i);
			con++;
			System.out.printf("%s%s",e,a);
			System.out.println();			
			
		}
		con=2;
		for (int i = 7; i >= 1; i=i-2)
		{
			e=e(con);
			a=a(i);
			con++;
			System.out.printf("%s%s",e,a);
			System.out.println();				
		}
		System.out.println();				
	}
}
