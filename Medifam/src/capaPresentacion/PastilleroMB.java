package capaPresentacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import capaDatos.Pastillero;
import capaDatos.Persona;
import capaNegocio.LogicaNegocio;

@Named
@SessionScoped
public class PastilleroMB implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@EJB
	private LogicaNegocio proveedor;
	
	private List<Pastillero> pastillero;
	private Persona persona;
	
	private String frecuencia;
	private String nombre;
	private String apellidos;
	
	private boolean ver;
	
	public PastilleroMB() 
	{
		pastillero = new ArrayList<Pastillero>();
		persona = new Persona();
	}

	public List<Pastillero> getPastillero() 
	{
		return pastillero;
	}

	public void setPastillero(List<Pastillero> pastillero) 
	{
		this.pastillero = pastillero;
	}

	public Persona getPersona()
	{
		return persona;
	}

	public void setPersona(Persona persona) 
	{
		this.persona = persona;
	}

	public String getFrecuencia() 
	{
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia)
	{
		this.frecuencia = frecuencia;
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellidos() 
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public boolean isVer() 
	{
		return ver;
	}

	public void setVer(boolean ver) 
	{
		this.ver = ver;
	}
	
	public void visualizarPastillero() 
	{
		setVer(true);
		
		persona = proveedor.leerPersona(nombre, apellidos);
		setPersona(persona);
		
		String idPersona = persona.getIdPersona();
		
		pastillero = proveedor.leerPastillerosPersona(idPersona);
		setPastillero(pastillero);
	}
}
