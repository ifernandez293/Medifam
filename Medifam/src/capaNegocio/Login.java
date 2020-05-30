package capaNegocio;

public class Login
{
	private String nombre;
	private String apellidos;
	
	public Login(String nombre, String apellidos) 
	{
		setNombre(nombre);
		setApellidos(apellidos);
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getApellidos()
	{
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) 
	{
		this.apellidos = apellidos;
	}

	public String getPassword(String nombre, String apellidos) 
	{
		return "1234AAA";
	}
	
}


