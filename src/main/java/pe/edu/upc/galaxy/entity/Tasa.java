package pe.edu.upc.galaxy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tasas")
public class Tasa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CTasa")
	private Integer id;

	@Column(name = "periodo")
	private int periodo;

	@Column(nullable = false, name = "perido_capitalizacion")
	private int peridoCapitalizacion;

	@Column(name = "tipo_taza")
	private String tipoTaza;

	@Column(name = "porcentaje_taza")
	private float porcentajeTaza;

	@OneToMany(mappedBy = "tasa", fetch = FetchType.LAZY)
	private List<Valor> valores;

	public Tasa() {
		valores = new ArrayList<Valor>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getPeridoCapitalizacion() {
		return peridoCapitalizacion;
	}

	public void setPeridoCapitalizacion(int peridoCapitalizacion) {
		this.peridoCapitalizacion = peridoCapitalizacion;
	}

	public String getTipoTaza() {
		return tipoTaza;
	}

	public void setTipoTaza(String tipoTaza) {
		this.tipoTaza = tipoTaza;
	}

	public float getPorcentajeTaza() {
		return porcentajeTaza;
	}

	public void setPorcentajeTaza(float porcentajeTaza) {
		this.porcentajeTaza = porcentajeTaza;
	}

	public List<Valor> getValores() {
		return valores;
	}

	public void setValores(List<Valor> valores) {
		this.valores = valores;
	}

}
