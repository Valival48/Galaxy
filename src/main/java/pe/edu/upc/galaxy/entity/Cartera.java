package pe.edu.upc.galaxy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "carteras", indexes = { @Index(columnList = "DDescuento", name = "carteras_index_DDescuento") })
public class Cartera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CCartera")
	private Integer id;

	@OneToMany(mappedBy = "cartera",fetch = FetchType.EAGER)
	private List<Valor> valores;


	@ManyToOne
	@JoinColumn(name = "CTasa", nullable = true)
	private Tasa tasa;


	@Column(name = "Tipo_calendario", nullable =true)
	private String calendario;
	
	@Column(name = "Cargo" , nullable =true)
	private double cargo;

	@Column(name = "DDescuento" , nullable =true)
	@Temporal(TemporalType.DATE)
	private Date fechaDescuento;

	@Column(name = "Tipo_Cambio" , nullable =true)
	private boolean tipoCambio;

	@Column(name = "valor_nominal" , nullable =true)
	private double valorNominal;

	public Cartera() {
		super();
		valores= new ArrayList<Valor>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Tasa getTasa() {
		return tasa;
	}

	public void setTasa(Tasa tasa) {
		this.tasa = tasa;
	}

	
	

	public String getCalendario() {
		return calendario;
	}

	public void setCalendario(String calendario) {
		this.calendario = calendario;
	}

	public double getCargo() {
		return cargo;
	}

	public void setCargo(double cargo) {
		this.cargo = cargo;
	}

	

	public Date getFechaDescuento() {
		return fechaDescuento;
	}

	public void setFechaDescuento(Date fechaDescuento) {
		this.fechaDescuento = fechaDescuento;
	}

	public boolean isTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(boolean tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public double getValorNominal() {
		return valorNominal;
	}

	public void setValorNominal(double valorNominal) {
		this.valorNominal = valorNominal;
	}

	public List<Valor> getValores() {
		return valores;
	}

	public void setValores(List<Valor> valores) {
		this.valores = valores;
	}

	
}
