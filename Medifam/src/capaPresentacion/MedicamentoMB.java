package capaPresentacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import capaDatos.Medicamento;
import capaDatos.Persona;
import capaNegocio.LogicaNegocio;

@Named
@RequestScoped
public class MedicamentoMB implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@EJB
	private LogicaNegocio proveedor;
	
	private List<Persona> persona;
	private List<Medicamento> medicamento;
	
	private boolean ver;
	
	private int idMedicamento;
	private int unidades;
	
	public MedicamentoMB() 
	{	
		medicamento = new ArrayList<Medicamento>();
		persona = new ArrayList<Persona>();
	}

	public List<Persona> getPersona() 
	{
		return persona;
	}

	public void setPersona(List<Persona> persona) 
	{
		this.persona = persona;
	}

	public List<Medicamento> getMedicamento() 
	{
		return medicamento;
	}

	public void setMedicamento(List<Medicamento> medicamento) 
	{
		this.medicamento = medicamento;
	}

	public boolean isVer() 
	{
		return ver;
	}

	public void setVer(boolean ver) 
	{
		this.ver = ver;
	}
	
	public int getIdMedicamento() 
	{
		return idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) 
	{
		this.idMedicamento = idMedicamento;
	}

	public int getUnidades()
	{
		return unidades;
	}

	public void setUnidades(int unidades) 
	{
		this.unidades = unidades;
	}

	public void visualizarStock() 
	{
		setVer(true);
		
		setMedicamento(proveedor.leerMedicamentos());
	}
	
	public void consumirStock() 
	{
		proveedor.consumirMedicamento(idMedicamento, unidades);
	}
	
	public void rellenarStock() 
	{
		proveedor.rellenarMedicamento(idMedicamento, unidades);
	}
	
	public List<Medicamento> getListadoMedicamentos()
	{
		return proveedor.leerMedicamentos();
	}
}
