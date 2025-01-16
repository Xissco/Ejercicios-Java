//
//Clase E315 
//Contiene sus variables y los metodos para establecerlas y obternerlar. 
//

public class LibroDeCalificaciones
{
	private String NombreDelCurso;
	private String NombreDelProfesor;
	
	public LibroDeCalificaciones (String Nombre, String Profesor)
	{
	NombreDelCurso=Nombre;
	NombreDelProfesor=Profesor;
	}
		
	public void setNombreDelCurso (String Nombre)
	{
		NombreDelCurso=Nombre;
	}
	public String getNombreDelCurso ()
	{
		return NombreDelCurso;
		
	}
    public void setNombreDelProfesor (String Profesor)
	{
		NombreDelProfesor=Profesor;
	}
	public String getNombreDelProfesor ()
	{
		return NombreDelProfesor;
		
	}
	public void ShowM()
	{
		System.out.printf("Bienvenido al libro de calificaciones para: \n%s\n", getNombreDelCurso());
		System.out.println();
		System.out.printf("Presentado por: \n%s\n", getNombreDelProfesor());
		System.out.println();
	}
}
