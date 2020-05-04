package capaPresentacion;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import capaDatos.Persona;

@Named
@RequestScoped
public class PersonaMB implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Persona persona = new Persona();
	
	private boolean dentro;
	
	public Persona getPersona() 
	{
		return persona;
	}

	public void setPersona(Persona persona)
	{
		this.persona = persona;
	}
	
	public boolean isDentro()
	{
		return dentro;
	}

	public void setDentro(boolean dentro) 
	{
		this.dentro = dentro;
	}

	public String getIdPersona() 
	{
		return persona.getIdPersona();
	}

	public void setIdPersona(String idPersona)
	{
		persona.setIdPersona(idPersona);
	}

	public String getApellidos() 
	{
		return persona.getApellidos();
	}

	public void setApellidos(String apellidos) 
	{
		persona.setApellidos(apellidos);
	}

	public String getDireccion()
	{
		return persona.getDireccion();
	}

	public void setDireccion(String direccion) 
	{
		persona.setDireccion(direccion);
	}

	public Date getNacimiento() 
	{
		return persona.getNacimiento();
	}

	public void setNacimiento(Date nacimiento)
	{
		persona.setNacimiento(nacimiento);
	}

	public String getNombre() 
	{
		return persona.getNombre();
	}

	public void setNombre(String nombre) 
	{
		persona.setNombre(nombre);
	}
}
