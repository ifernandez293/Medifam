package capaDatos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Consulta database table.
 * 
 */
@Entity
@NamedQueries
({
	@NamedQuery(name="Consulta.findAll", query="SELECT c FROM Consulta c"),
	@NamedQuery(name="Consulta.findByDNI", query="SELECT c FROM Consulta c WHERE c.persona_idPersona=:idPersona"),
})
public class Consulta implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsulta;

	private int facultativo_idFacultativo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String persona_idPersona;

	public Consulta() {
	}

	public int getIdConsulta() {
		return this.idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public int getFacultativo_idFacultativo() {
		return this.facultativo_idFacultativo;
	}

	public void setFacultativo_idFacultativo(int facultativo_idFacultativo) {
		this.facultativo_idFacultativo = facultativo_idFacultativo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getPersona_idPersona() {
		return this.persona_idPersona;
	}

	public void setPersona_idPersona(String persona_idPersona) {
		this.persona_idPersona = persona_idPersona;
	}

}