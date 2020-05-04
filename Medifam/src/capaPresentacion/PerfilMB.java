package capaPresentacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import capaDatos.Alergia;
import capaDatos.Persona;
import capaNegocio.LogicaNegocio;

@Named
@RequestScoped
public class PerfilMB implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@EJB
	private LogicaNegocio proveedor;
	
	private List<Persona> persona;
	private List<Alergia> alergia;
	
	private String nombre;
	private String apellidos;
	
	private boolean ver;
	
	public PerfilMB() 
	{
		persona = new ArrayList<Persona>();
		alergia = new ArrayList<Alergia>();
	}
	
	public List<Persona> getPersona() 
	{
		return persona;
	}

	public void setPersona(List<Persona> persona)
	{
		this.persona = persona;
	}
	
	public List<Alergia> getAlergia() 
	{
		return alergia;
	}

	public void setAlergia(List<Alergia> alergia)
	{
		this.alergia = alergia;
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
	
	public void imprimirDatos() 
	{	
		setVer(true);
		
		setPersona(proveedor.leerPersonaByNomApes(nombre, apellidos));
		setAlergia(proveedor.leerAlergiasByNomApes(nombre, apellidos));
	}
}
