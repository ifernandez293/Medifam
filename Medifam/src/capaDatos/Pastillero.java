package capaDatos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Pastillero database table.
 * 
 */
@Entity
@NamedQueries
({
	@NamedQuery(name="Pastillero.findAll", query="SELECT p FROM Pastillero p"), 
	@NamedQuery(name="Pastillero.findByDNI", query="SELECT p FROM Pastillero p WHERE p.persona.idPersona=:idPersona")
})
public class Pastillero implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	private int idPastillero;

	//uni-directional many-to-one association to Medicamento
	@ManyToOne
	private Medicamento medicamento;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	private Persona persona;

	public Pastillero() {
	}

	public int getIdPastillero() {
		return this.idPastillero;
	}

	public void setIdPastillero(int idPastillero) {
		this.idPastillero = idPastillero;
	}

	public Medicamento getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}