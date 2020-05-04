package capaPresentacion;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import capaDatos.Cita;
import capaDatos.Consulta;
import capaDatos.Facultativo;
import capaDatos.Persona;
import capaNegocio.LogicaNegocio;

@Named
@RequestScoped
public class CitaMB implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@EJB
	private LogicaNegocio proveedor;
	
	private Cita cita;
	
	private Persona persona;
	private List<Facultativo> facultativos;
	private List<Consulta> consultas;
	
	private String nombre;
	private String apellidos;
	
	private Date fecha;
	private String especialidad;
	
	private int idFacultativo;
	
	private boolean visualizar;
	
	public CitaMB() 
	{
		setCita(new Cita());
		
		persona = new Persona();
		facultativos = new ArrayList<Facultativo>();
		consultas = new ArrayList<Consulta>();
	}
	
	public Cita getCita() 
	{
		return cita;
	}

	public void setCita(Cita cita)
	{
		this.cita = cita;
	}

	public Persona getPersona() 
	{
		return persona;
	}

	public void setPersona(Persona persona)
	{
		this.persona = persona;
	}
	
	public List<Facultativo> getFacultativos() 
	{
		return facultativos;
	}

	public void setFacultativos(List<Facultativo> facultativos) 
	{
		this.facultativos = facultativos;
	}

	public List<Consulta> getConsultas() 
	{
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) 
	{
		this.consultas = consultas;
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
	
	public Date getFecha() 
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public String getEspecialidad() 
	{
		return especialidad;
	}

	public void setEspecialidad(String especialidad)
	{
		this.especialidad = especialidad;
	}

	public int getIdFacultativo() 
	{
		return idFacultativo;
	}

	public void setIdFacultativo(int idFacultativo)
	{
		this.idFacultativo = idFacultativo;
	}

	public boolean isVisualizar()
	{
		return visualizar;
	}
	
	public void setVisualizar(boolean visualizar)
	{
		this.visualizar = visualizar;
	}
	
	public void visualizarCitas() 
	{
		persona = proveedor.leerPersona(nombre, apellidos);
		
		consultas = proveedor.leerConsultasPorDNI(persona.getIdPersona());
		
		for( int i = 0; i < consultas.size(); i++ ) 
		{
			int idFacultativo = consultas.get(i).getFacultativo_idFacultativo();
			
			facultativos.add(proveedor.leerFacultativoPorID(idFacultativo)); 
		}
		
		setVisualizar(true);
		
		cita.setPersona(persona);
		cita.setConsultas(consultas);
		cita.setFacultativos(facultativos);
	}
	
	public void solicitarCita() 
	{
		
	}
	
	public List<Facultativo> getListadoFacultativos()
	{
		return proveedor.leerFacultativos();
	}
}
