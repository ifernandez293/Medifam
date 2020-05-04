package capaNegocio;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import capaDatos.Alergia;
import capaDatos.Consulta;
import capaDatos.Facultativo;
import capaDatos.Medicamento;
import capaDatos.Pastillero;
import capaDatos.Persona;

@Stateless
@LocalBean
public class LogicaNegocio implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Consulta> leerConsultas()
	{
		return em.createNamedQuery("Consulta.findAll").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Consulta> leerConsultasPorDNI(String idPersona)
	{
		return em.createNamedQuery("Consulta.findByDNI")
					.setParameter("idPersona", idPersona)
						.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Persona> leerPersonaByNomApes(String nombre, String apellidos)
	{
		return em.createNamedQuery("Persona.findByNameApes")
					.setParameter("nombre", nombre)
						.setParameter("apellidos", apellidos)
							.getResultList();
	}
	
	public Persona leerPersona(String nombre, String apellidos) 
	{
		return (Persona) em.createNamedQuery("Persona.findByNameApes")
							.setParameter("nombre", nombre)
								.setParameter("apellidos", apellidos)
									.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Persona> leerFamilia()
	{
		return em.createNamedQuery("Persona.findAll").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Alergia> leerAlergiasByNomApes(String nombre, String apellidos)
	{
		return em.createNamedQuery("Alergia.findByNameApes")
				.setParameter("nombre", nombre)
					.setParameter("apellidos", apellidos)
						.getResultList();
	}
	
	public Pastillero leerPastilleroPersona(String idPersona)
	{	
		return (Pastillero)em.createNamedQuery("Pastillero.findByDNI")
								.setParameter("idPersona", idPersona)
									.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Pastillero> leerPastillerosPersona(String idPersona)
	{	
		return em.createNamedQuery("Pastillero.findByDNI")
								.setParameter("idPersona", idPersona)
									.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Medicamento> leerMedicamentos()
	{
		return em.createNamedQuery("Medicamento.findAll").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Medicamento> leerMedicamentosPorId(int id)
	{
		return em.createNamedQuery("Medicamento.findByID").getResultList();
	}
	
	public Medicamento leerMedicamentoPorID(int id)
	{
		return em.find(Medicamento.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Facultativo> leerFacultativos()
	{
		return em.createNamedQuery("Facultativo.findAll").getResultList();
	}
	
	public Facultativo leerFacultativoPorID(int idFacultativo) 
	{
		return em.find(Facultativo.class, idFacultativo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Facultativo> leerFacultativosID(int idFacultativo)
	{
		return em.createNamedQuery("Facultativo.findByDNI")
					.setParameter("idFacultativo", idFacultativo)
						.getResultList();
	}
	
	public void rellenarMedicamento(int id, int unidades) 
	{
		Medicamento medicamento = em.find(Medicamento.class, id);
		int stock = medicamento.getStock();
		
		stock += unidades;
		medicamento.setStock(stock);
		
		em.merge(medicamento);
	}
	
	public void consumirMedicamento(int id, int unidades) 
	{
		Medicamento medicamento = em.find(Medicamento.class, id);
		int stock = medicamento.getStock();
		
		stock -= unidades;
		medicamento.setStock(stock);
		
		em.merge(medicamento);
	}
}