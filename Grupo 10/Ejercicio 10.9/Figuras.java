//
//Ejercicio 10.9
//Project: Classes ShapeHierarchy (Clases y Metodos)
//

public abstract class Figuras
{
	private String name;
	
	public Figuras (String nombre)
	{
		name = nombre;
	}
	
	public void setname(String nombre)
	{
		name = nombre;
	}
	
	public String getname()
	{
		return name;
	}
	
	public abstract String getdescripcion();
	
}

abstract class FiguraBidimensional extends Figuras
{	
	public FiguraBidimensional (String nombre)
	{
		super(nombre);
	}
	
	public String getdescripcion()
	{
		return String.format("%s","Es una figura que posee dos dimensiones");
	}
		
	public abstract String getarea();	
}

abstract class FiguraTridimensional extends Figuras
{
	public FiguraTridimensional (String nombre)
	{
		super(nombre);
	}
	
	public String getdescripcion()
	{
		return String.format("%s","Es una figura que posee tres dimensiones");
	}
		
	public abstract String getarea();	
	public abstract String getvolumen();
}

class Circulo extends FiguraBidimensional
{
	private double radio;
		
	public Circulo(double r)
	{
		super("El Circulo");
		radio=r;		
	}

	public String getarea()
	{		
		double area = Math.pow(radio,2)*Math.PI;
		return String.format ("%s %.2f %s: %.2f","El area de la circunferencia con radio",radio,"es",area); 
	}
	
	public String toString()
	{
		return String.format("\n%s %s\n%s\n",getname(),getdescripcion(),getarea());
	} 
}

class Esfera extends FiguraTridimensional
{
	private double radio;
	
	public Esfera (double r)
	{
		super("La Esfera");
		radio=r;			
	}
	
	public double getradio ()
	{
		return radio;
	}
	
	public String getarea()
	{		
		double area = (4)*Math.PI*Math.pow(getradio(),2);
		return String.format ("\n%s %.2f %s: %.2f","El area de la esfera con radio",radio,"es",area); 		
	}
	
	public String getvolumen()
	{		
		double volumen = (4/3)*Math.PI*Math.pow(getradio(),3);
		return String.format ("\n%s %.2f %s: %.2f","El volumen de la esfera con radio",radio,"es",volumen); 		
	}
	
	public String toString()
	{
		return String.format(
		"\n%s %s %s%s\n",
		getname(),getdescripcion(),getarea(),getvolumen());
	} 
}
