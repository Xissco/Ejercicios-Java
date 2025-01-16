//
//Ejercicio 3.14
//Employee Class
//

import java.util.Scanner;

public class PruebaEmpleados
{	
	public static void main (String args[])
	{	
	Scanner Escan1 = new Scanner(System.in);
	Empleados Empleado1 = new Empleados("Mary","Sue",0.00);
	Empleados Empleado2 = new Empleados("Gary","Stu",0.00); 
	double salaryy1=0;
	double salaryy110=0;
	double salaryy2=0; 
	double salaryy210=0;	
	String p="%";
	
	System.out.println("Datos del Empleado 1:");
	System.out.println();
	System.out.printf("El empleado %s %s gana mensualmente %.2f anualmente %.2f mas un bono del 10%s %.2f\n",
	Empleado1.getname(),Empleado1.getLName(),Empleado1.getsalary(),salaryy1,p,salaryy110);
	System.out.println();
	
	System.out.println("Datos del Empleado 2:");
	System.out.println();
	System.out.printf("El empleado %s %s gana mensualmente %.2f anualmente %.2f mas un bono del 10%s %.2f\n",
	Empleado2.getname(),Empleado2.getLName(),Empleado2.getsalary(),salaryy2,p,salaryy210);
	System.out.println(); 
	
	System.out.println("Ingrese el nombre del Empleado 1");
	String Name1=Escan1.nextLine();
	Empleado1.setname(Name1);
	System.out.println();
	
	System.out.println("Ingrese el apellido del Empleado 1");
	String LName1=Escan1.nextLine();
	Empleado1.setLName(LName1);
	System.out.println();
	
	System.out.println("Ingrese el Salario Mensual del Empleado 1");
	Double Salary1=Escan1.nextDouble();
	Escan1.nextLine();
	Empleado1.setSalary(Salary1);
	System.out.println();
			
	System.out.println("Ingrese el nombre del Empleado 2");
	String Name2=Escan1.nextLine();
	Empleado2.setname(Name2);
	System.out.println();
	
	System.out.println("Ingrese el apellido del Empleado 2");
	String LName2=Escan1.nextLine();
	Empleado2.setLName(LName2);
	System.out.println();
	
	System.out.println("Ingrese el Salario Mensual del Empleado 1");
	Double Salary2=Escan1.nextDouble();
	Escan1.nextLine();
	Empleado2.setSalary(Salary2);
	System.out.println();
			
	salaryy1=Salary1*12;
	salaryy110=salaryy1*1.1;	
	salaryy2=Salary2*12;
	salaryy210=salaryy2*1.1;
		
	System.out.println("Datos del Empleado 1:");
	System.out.println();
	System.out.printf("El empleado %s %s gana mensualmente %.2f anualmente %.2f mas un bono del 10%s %.2f\n",
	Empleado1.getname(),Empleado1.getLName(),Empleado1.getsalary(),salaryy1,p,salaryy110);
	System.out.println();
	
	System.out.println("Datos del Empleado 2:");
	System.out.println();
	System.out.printf("El empleado %s %s gana mensualmente %.2f anualmente %.2f mas un bono del 10%s %.2f\n",
	Empleado2.getname(),Empleado2.getLName(),Empleado2.getsalary(),salaryy2,p,salaryy210);
	System.out.println(); 
		
	}
}
