package capaDatos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Pertenece database table.
 * 
 */
@Entity
@NamedQuery(name="Pertenece.findAll", query="SELECT p FROM Pertenece p")
public class Pertenece implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPertenece;

	//uni-directional many-to-one association to Familia
	@ManyToOne
	private Familia familia;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	private Persona persona;

	public Pertenece() {
	}

	public int getIdPertenece() {
		return this.idPertenece;
	}

	public void setIdPertenece(int idPertenece) {
		this.idPertenece = idPertenece;
	}

	public Familia getFamilia() {
		return this.familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}