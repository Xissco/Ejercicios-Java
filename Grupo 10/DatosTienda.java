//
//Datos Tienda
//

import java.util.Scanner; 

public class DatosTienda 
{	
	final String Name = "Movie City";
	final String Descripcion = "Venta de Peliculas Originales";
	final String RUC = "010259802";
	
	public String getname()
	{
		return Name;
	}
	
	public String getdescripcion()
	{
		return Descripcion;
	}
	
	public String getRUC()
	{
		return RUC;
	}		
}

class Productos extends DatosTienda 
{
	private final String [] producto ={"CD","CD Original","Blue Ray"};
	private final String [] serial = {"MCCD1","MCCD2","MCBR"};
	private final double [] precio = {1.50,5.00,10.00};	
	int np=serial.length;
		
	public double getprecio (int n)
	{
		return precio [n];
	}
	
	public String getserial (int n)
	{
		return serial [n];
	}		
	
	public void getproductos()
	{	
		System.out.printf("\n%-15s","");
		for(String p: producto)
		{
			System.out.printf("%-15s",p);
		}		
		System.out.printf("\n%-15s","Producto");
		
		for(double p: precio)
		{
			System.out.printf("%-15.2f",p);
		}
		System.out.printf("\n\n\n");
		
	} 	
}

class Factura extends Productos 
{
	private String Cliente;
	private String Direccion;
	private String CI;
	private String Telefono;
	Scanner Escan1 = new Scanner(System.in);
	
	public void setcliente (String C)
	{
		Cliente=C;
	}
	
	public void setdireccion (String D)
	{
		Direccion=D;
	}
	
	public void setCI (String Ci)
	{
		CI=Ci;
	}
	
	public void settelefono (String T)
	{
		Telefono=T;
	}
	
	public String getcliente ()
	{
		return Cliente;
	}
	
	public String getdireccion ()
	{
		return Direccion;
	}
	
	public String getCI ()
	{
		return CI;
	}
	
	public String gettelefono ()
	{
		return Telefono;
	}	
}
