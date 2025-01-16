//
//Ejercicio 5.12
//Calculating the Product of Odd Integers)
//

public class Producto115
{
	
	public static void main (String args[]) 
	{
		int pro=1;
		
		for (int i = 1; i <= 15 ; i=i+2)
		{
			pro=pro*i;
		}
		System.out.printf("El producto de los numeros impares del 1 al 15 es: %d\n",pro);
				
	}
}
