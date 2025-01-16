//
//Herenacia
//

public class Mate1 
{
	int a=16;
	int b=4;
	
	public int Suma ()
	{
		int suma=a+b;
		return suma;
	}
	
	public int Resta()
	{
		int resta = a-b;
		return resta;
	}
	
}

class Mate2 extends Mate1
{
	public int multiplicacion()
	{
		int multiplicacion = a*b;
		return multiplicacion;		
	}
	public int division ()
	{
		int division = a/b;
		return division;
	}
} 

class Mate3 extends Mate2
{
	public double potencia()
	{
		double potencia=Math.pow(a,b);
		return potencia;
	} 
	
	public double raiz()
	{
		double raiz=Math.sqrt(a);
		return raiz;
	}
}
