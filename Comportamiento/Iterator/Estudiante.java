package iterator;

public class Estudiante {

	String nombre;
	String apellidos;
	int edad;
	
	public Estudiante(String nombre,String apellidos,int edad) {
		this.nombre= nombre;
		this.apellidos = apellidos;
		this.edad=  edad;
	}
	
	public String toString()
	{
		return nombre;
	}

}
