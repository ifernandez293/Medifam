package capaDatos;

import java.util.ArrayList;
import java.util.List;

public class Cita 
{
	private Persona persona;
	private List<Facultativo> facultativos;
	private List<Consulta> consultas;
	
	public Cita() 
	{
		persona = new Persona();
		facultativos = new ArrayList<Facultativo>();
		consultas = new ArrayList<Consulta>();
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
	
	
}
