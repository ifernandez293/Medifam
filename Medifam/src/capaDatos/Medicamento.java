package capaDatos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Medicamento database table.
 * 
 */
@Entity
@NamedQueries
({
	@NamedQuery(name="Medicamento.findAll", query="SELECT m FROM Medicamento m"), 
	@NamedQuery(name="Medicamento.findByID", query="SELECT m FROM Medicamento m WHERE m.idMedicamento=:idMedicamento")
})
public class Medicamento implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	private int idMedicamento;

	private String detalle;

	private String nombre;

	private int stock;

	public Medicamento() {
	}

	public int getIdMedicamento() {
		return this.idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
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

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}