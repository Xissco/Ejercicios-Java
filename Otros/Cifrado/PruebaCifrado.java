//
//Ejercicio
//{Introduccion}
//

import java.util.Scanner;

public class PruebaCifrado
{
	
	public static void main (String args[]) 
	{
		Cifrado Cifrado1 = new Cifrado();
		Scanner Scan1 = new Scanner(System.in);
		System.out.println("Ingrese la palabra a cifrar");
		String cif1 = Scan1.nextLine();
		String r = Cifrado1.A1Z26(cif1);
		System.out.println(r);		
	}
}
