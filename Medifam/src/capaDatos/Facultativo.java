package capaDatos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Facultativo database table.
 * 
 */
@Entity
@NamedQueries
({
	@NamedQuery(name="Facultativo.findAll", query="SELECT f FROM Facultativo f"), 
	@NamedQuery(name="Facultativo.findByDNI", query="SELECT f FROM Facultativo f WHERE f.idFacultativo=:idFacultativo"),
})
public class Facultativo implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	private int idFacultativo;

	private String apellidos;

	private String centro;

	private String especialidad;

	private String nombre;

	public Facultativo() {
	}

	public int getIdFacultativo() {
		return this.idFacultativo;
	}

	public void setIdFacultativo(int idFacultativo) {
		this.idFacultativo = idFacultativo;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCentro() {
		return this.centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}