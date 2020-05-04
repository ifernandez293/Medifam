package capaDatos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Alergia database table.
 * 
 */

@Entity
@NamedQueries
({
	@NamedQuery(name="Alergia.findAll", query="SELECT a FROM Alergia a"),
	@NamedQuery(name="Alergia.findByNameApes", query="SELECT a FROM Alergia a WHERE (a.persona.nombre=:nombre) AND (a.persona.apellidos=:apellidos)")
})
public class Alergia implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	private int idAlergia;

	private String detalle;

	private String nombre;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	private Persona persona;

	public Alergia() {
	}

	public int getIdAlergia() {
		return this.idAlergia;
	}

	public void setIdAlergia(int idAlergia) {
		this.idAlergia = idAlergia;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}