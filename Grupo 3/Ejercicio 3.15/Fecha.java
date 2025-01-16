//
//Ejercicio 3.15
//Date Class
//

public class Fecha 
{
	private int mes;
	private int dia;
	private int year; 
	
	public Fecha(int mesp, int diap, int yearp)
	{
		if (mesp<=12 & mesp>0)
		{
			mes=mesp;
		}		
		if (diap<=31 & diap>0)
		{
			dia=diap;
		}		
		if (yearp>0)
		{
			year=yearp;
		}
	}	
		
	public void setmes (int mesp)
	{
		if (mesp<=12 & mesp>0)
		{
			mes=mesp;
		}
	}
	
	public void setdia(int diap)
	{
		if (diap<=31 & diap>0)
		{
			dia=diap;
		}
	}	
	
	public void setyear(int yearp)
	{
		if (yearp>0)
		{
			year=yearp;
		}
	}
	
	public int getmes()
	{
		return mes;
	}
	
	public int getdia()
	{
		return dia;
	}
	
	public int getyear()
	{
		return year;
	}
	
	public void ShowF()
	{
		System.out.println("La fecha en formato mes/dia/año es:"); 
		System.out.printf("La fecha es %d/%d/%d\n",getmes(),getdia(),getyear());
		System.out.println();
	}
		 
}
	
	

