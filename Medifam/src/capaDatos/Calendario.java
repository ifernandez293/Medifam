package capaDatos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Calendario database table.
 * 
 */
@Entity
@NamedQuery(name="Calendario.findAll", query="SELECT c FROM Calendario c")
public class Calendario implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	private int idCalendario;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	private Persona persona;

	public Calendario() {
	}

	public int getIdCalendario() {
		return this.idCalendario;
	}

	public void setIdCalendario(int idCalendario) {
		this.idCalendario = idCalendario;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}