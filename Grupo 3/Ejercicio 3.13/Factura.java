//
//Ejercicio 3.13
//Cantiene los metodos y variables de instancia de la clase PruebaFactura
//

public class Factura 
{	
	String Serial;
	String Description;
	int Quantity;
	double Price;
	
	public Factura (String Serie, String Descripcion, int Cantidad, double Precio)
	{
		Serial=Serie;
		Description=Descripcion;
		Quantity=Cantidad;
		Price=Precio;
	}
	
	public void setserial (String Serie)
	{
		Serial=Serie;
	}
	
	public void setdescription (String Descripcion)
	{
		Description=Descripcion;	
	}
	
	public void setquantity (int Cantidad)
	{
		Quantity=Cantidad;
	}
	
	public void setprice (Double Precio)
	{
		if (Precio>=0)
		{
			Price=Precio;
		}
		else
		{
			Price=0;
		}		
	}
	
	public String getserial ()
	{
		return Serial;	
	}
	
	public String getdescription ()
	{
		return Description;
	}
	
	public int getquantity ()
	{
		return Quantity; 
	}
	public double getprice ()
	{
		return Price;
	}
	
	public double getIvoiceAmaunt ()
	{
		double Price=getprice();
		int Quantity=getquantity();
		if (Quantity<0)
		{
			Quantity=0;
		}
		double Total=Price*Quantity;
		return Total;  
	}
	
	public void ShowI()
	{
		System.out.printf("%-10s%-15s%-15s%-10s\n","Serie","Descripcion","Cantidad","Precio");
		System.out.println();
		System.out.printf("%-10s%-15s%-15d%-10.2f\n",getserial(),getdescription(),getquantity(),getprice());
		System.out.println();
		System.out.printf("El valor total de la factura es: %.2f\n\n",getIvoiceAmaunt());
	}
}

