//
//Ejercicio 5.14
//Modified Compound-Interest Program
//

public class Interes
{
	public static Double interes(Double p, Double r, int n)
	{
		Double a;
		a=p*Math.pow(1+r,n);
		return a;
	}
	
	public static void main (String args[]) 
	{
		Double p=1000.00;
		Double r=0.05;
		Double a;
		String t="%";
		
		for (int i = 1; i <= 6; i++)
		{
			System.out.printf("Interes del %.2f%s\n\n",r*100,t);
			System.out.printf("%-10s%-20s\n\n","Year","Cantidad");
		
			for (int n = 1; n <= 10; n++)
			{
				a=interes(p,r,n);
				System.out.printf("%-10d%-20.2f\n",n,a);
			
			}
			System.out.println();
			r=r+0.01;
			
		}
				
	}
}
