//
//Ejercicio 3.13
//Ivoice Class
//

import java.util.Scanner;

public class PruebaFactura 
{
	
	public static void main (String args[]) 
	{
		Scanner Escan1 = new Scanner (System.in);
		Factura Factura1 = new Factura("OE1","Palo selfie",5,5.99);
		
		Factura1.ShowI();
		
		System.out.println("Ingrese el serial del objeto");
		String Serial=Escan1.nextLine();
		Factura1.setserial(Serial);
		System.out.println(); 
		
		System.out.println("Ingrese el nombre del objeto");
		String Description=Escan1.nextLine();
		Factura1.setdescription(Description);
		System.out.println(); 
		
		System.out.println("Ingrese la cantidad de objetos");
		int Quantity=Escan1.nextInt();
		Factura1.setquantity(Quantity);
		System.out.println(); 
		
		System.out.println("Ingrese el precio del objeto");
		double Price=Escan1.nextDouble();
		Factura1.setprice(Price);
		System.out.println();
		
		Factura1.ShowI();  
	}
}
