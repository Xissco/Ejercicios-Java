//
//Ejercicio
//{Introduccion}
//

import java.util.Arrays;
import java.util.List;

public class prueba 
{
	
	public static void main (String args[]) 
	{
		String[] p1 = "xyzabcdefghijklmnopqrstuvw ".split("");
		
		for (String i : p1)
		{
			System.out.println(i);
		}
		System.out.println(String.valueOf(p1.length));
		
		int ToNum = Arrays.asList(p1).indexOf("w");
		System.out.println(String.valueOf(ToNum));
		
		
	}
}
