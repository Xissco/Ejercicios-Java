//
//Cifrado
//
//

import java.util.Arrays;
import java.util.List;

public class Cifrado 
{
	public String Caesar (String ACifrar)
	{
		String CCaesar="";
		char[] ToArray = ACifrar.toCharArray();	
		int[] num = Buscador(ToArray);		
		char[] xyz = "defghijklmnopqrstuvwxyzabcDEFGHIJKLMNOPQRSTUVWXYZABC ".toCharArray();
		for (int i : num)
		{
			CCaesar=CCaesar+xyz[i]; 
		}
		return CCaesar;		
	}

	public String Atbash (String ACifrar)
	{
		String CAtbash="";
		char[] ToArray = ACifrar.toCharArray();	
		int[] num = Buscador(ToArray);		
		char[] zyx = "zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA ".toCharArray();
		for (int i : num)
		{
			CAtbash=CAtbash+zyx[i]; 
		}
		return CAtbash;		
	}
	
	public String A1Z26 (String ACifrar)
	{
		String CA1Z26="";
		char[] ToArray = ACifrar.toCharArray();	
		int[] num = Buscador(ToArray);		
		String[] a123 =
		"1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26  " .split(" ");
		for (int i : num)
		{
			CA1Z26=CA1Z26+a123[i]+"-"; 
		}
		return CA1Z26.substring(0,CA1Z26.length()-1);		
	}	
	
	public int[] Buscador (char[] Expresion)
	{
		String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		int[] ToNum = new int[Expresion.length];	
		int i=0;
		for (char p : Expresion)
		{
			ToNum[i] = abc.indexOf(p);
			i=i+1;						
		}
		return ToNum;
	}		
}
	

