//
//Ejercicio 4.19
//Sales Commision Calculator
//

import java.util.Scanner;

public class CalcularComision 
{
	
	public static void main (String args[]) 
	{
		double value;
		int article=0;
		double comission=0;
		double payment;
		double valuet=0;
		Scanner Escan1 = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del articulo vendido");
		while (Escan1.hasNext())
		{
			value=Escan1.nextDouble();
			article ++;
			valuet = valuet + value;
			comission = comission + (value*0.09);
			System.out.println("Ingrese el valor del articulo vendido o presione Crtl+D para terminar");
		}
		
		payment = 200 + comission;
		System.out.printf("Se han vendido %d articulos con ganancias de %.2f\n\n",article,valuet);
		System.out.printf("Comision=%.2f\n\n",comission);
		System.out.printf("Pago Total=%.2f\n\n",payment);
				
	}
}
