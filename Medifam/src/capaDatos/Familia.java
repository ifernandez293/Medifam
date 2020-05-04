package capaDatos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Familia database table.
 * 
 */
@Entity
@NamedQuery(name="Familia.findAll", query="SELECT f FROM Familia f")
public class Familia implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	private int idFamilia;

	public Familia() {
	}

	public int getIdFamilia() {
		return this.idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}

}