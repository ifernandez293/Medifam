package capaDatos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Persona database table.
 * 
 */
@Entity
@NamedQueries
({
	@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p"),
	@NamedQuery(name="Persona.findByNameApes", query="SELECT p FROM Persona p WHERE (p.nombre=:nombre) AND (p.apellidos=:apellidos)")
	
})
public class Persona implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	private String idPersona;

	private String apellidos;

	private String direccion;
	
	@Temporal(TemporalType.DATE)
	private Date nacimiento;

	private String nombre;

	public Persona() {
	}

	public String getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getNacimiento() {
		return this.nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}