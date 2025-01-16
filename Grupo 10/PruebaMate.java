//
//Prueba Mate
//

public class PruebaMate 
{
	
	public static void main (String args[]) 
	{
		Mate1 Calculadora1 = new Mate1();
		Mate2 Calculadora2 = new Mate2();
		Mate3 Calculadora3 = new Mate3();
		
		System.out.println("Suma");
		System.out.println(Calculadora1.Suma());
		System.out.println(Calculadora2.Suma());
		System.out.println(Calculadora3.Suma());
		System.out.println();
		
		System.out.println("Resta");
		System.out.println(Calculadora1.Resta());
		System.out.println(Calculadora2.Resta());
		System.out.println(Calculadora3.Resta());
		System.out.println();
		
		System.out.println("Multiplicacion");
		System.out.println(Calculadora2.multiplicacion());
		System.out.println(Calculadora3.multiplicacion());
		System.out.println();
		
		System.out.println("Division");
		System.out.println(Calculadora2.division());
		System.out.println(Calculadora3.division());
		System.out.println();
		
		System.out.println("Potencia");
		System.out.println(Calculadora3.potencia());
		System.out.println();
		
		System.out.println("Raiz");
		System.out.println(Calculadora3.raiz());
		System.out.println();
	}
}
