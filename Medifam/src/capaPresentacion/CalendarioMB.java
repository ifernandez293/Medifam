package capaPresentacion;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import capaDatos.Persona;
import capaNegocio.LogicaNegocio;


@Named
@RequestScoped
public class CalendarioMB implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@EJB
	private LogicaNegocio proveedor;
	
	private List<Persona> persona;
	private GregorianCalendar calendario;
	
	private boolean ver;
	
	private String nombre;
	private String apellidos;
	
	public CalendarioMB() 
	{
		persona = new ArrayList<Persona>();
		calendario = new GregorianCalendar();
	}
	
	public List<Persona> getPersona() 
	{
		return persona;
	}

	public void setPersona(List<Persona> persona) 
	{
		this.persona = persona;
	}

	public GregorianCalendar getCalendario() 
	{
		return calendario;
	}

	public void setCalendario(GregorianCalendar calendario) 
	{
		this.calendario = calendario;
	}
	
	public boolean isVer()
	{
		return ver;
	}

	public void setVer(boolean ver)
	{
		this.ver = ver;
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

	public void visualizarCalendario() 
	{	
		setVer(true);
		
		setPersona(proveedor.leerPersonaByNomApes(nombre, apellidos));
	}
}