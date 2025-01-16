//
//Clase Empleado (Ejercicio 3.14)
//Contiene las variables de intancia y los metodos set y get 
//

public class Empleados 
{
	private String Nombre;
	private String Apellido;
	private Double SalarioMes;
	
	public Empleados (String Name, String LName, Double Salary)
	{
	Nombre=Name;
	Apellido=LName;
	SalarioMes=Salary;	
	}
	
	public void setname (String Name)
	{
		Nombre=Name;		
	}
	public void setLName (String LName) 
	{
		Apellido=LName;
	}
	public void setSalary (Double Salary)
	{
		if (Salary>0)
		{
			SalarioMes=Salary;	
		}
	}
	public String getname()
	{
		return Nombre;
	}
	public String getLName()
	{
		return Apellido;
	}
	public Double getsalary()
	{
		return SalarioMes;
	}
}
