//
//Ejercicio 4.20
//Variables de instancia y metodos de la clase CalcularSalario 
//

public class Salario 
{
		private String name;
		private int numhourw;
		private double costhour;
				
		public Salario(String nombre, int hora, double costo)
		{
			name=nombre;
			numhourw=hora;
			costhour=costo; 
		}
		
		public void setname(String nombre)
		{
			name=nombre;
		}
		
		public void setnumhour (int hora)
		{
			numhourw=hora; 
		} 
		
		public void setcosthor (double costo)
		{
			costhour=costo; 			
		}
		
		public String getname()
		{
			return name;
		}
		
		public int getnumhour ()
		{
			return numhourw;
		}
		
		public double getcosthour ()
		{
			return costhour;
		}
		
		public double getsalary()
		{
			double salary;
			numhourw=getnumhour();
			costhour=getcosthour();
			if (numhourw<=40)
			{
				salary=numhourw*costhour;
			}
			else
			{
				numhourw = numhourw - 40;
				salary=(40*costhour)+(numhourw*(costhour*1.5));
			}
			return salary;
		}
		
		public void ShowS()
		{			
			System.out.printf("%-15s%-15d%-15.2f%-15.2f\n",getname(),getnumhour(),getcosthour(),getsalary());
		}				
	
}
