package pe.edu.upc.galaxy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity 
@Table(name = "carteras", 
	indexes = { @Index(columnList = "DDescuento", name = "carteras_index_DDescuento") })
public class Cartera {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CCartera",columnDefinition = "NUMERIC(6)")
	private Integer id;

@ManyToOne
@JoinColumn(name = "CValor",nullable = false)
private Valor valor;

@ManyToOne
@JoinColumn(name = "CCliente",nullable = false)
private Cliente cliente;

@ManyToOne
@JoinColumn(name = "CTasa",nullable = false)
private Tasa tasa;

@NotNull
@NotBlank
@Column(name="MGarantia")
private double  garantia;

@Column(name="Tipo_calendario")
private boolean calendario;

@Column(name="Tipo_movimiento")
private boolean movimiento;

@NotNull
@NotBlank
@Column(name="Cargo")
private double cargo;

@NotNull
@NotBlank
@Column(name="Abono")
private double Abono;

@Column(name = "DDescuento")
@Temporal(TemporalType.DATE)
private Date fechaDescuento;

@Column(name="Tipo_Cambio")
private boolean tipoCambio;

@Column(name="retencion")
private Integer retencion;

@Column(name="TCEA")
private double tcea;

@Column(name="valor_nominal")
private double valorNominal;

public Cartera() {}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Valor getValor() {
	return valor;
}

public void setValor(Valor valor) {
	this.valor = valor;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public Tasa getTasa() {
	return tasa;
}

public void setTasa(Tasa tasa) {
	this.tasa = tasa;
}

public double getGarantia() {
	return garantia;
}

public void setGarantia(double garantia) {
	this.garantia = garantia;
}

public boolean isCalendario() {
	return calendario;
}

public void setCalendario(boolean calendario) {
	this.calendario = calendario;
}

public boolean isMovimiento() {
	return movimiento;
}

public void setMovimiento(boolean movimiento) {
	this.movimiento = movimiento;
}

public double getCargo() {
	return cargo;
}

public void setCargo(double cargo) {
	this.cargo = cargo;
}

public double getAbono() {
	return Abono;
}

public void setAbono(double abono) {
	Abono = abono;
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

public Integer getRetencion() {
	return retencion;
}

public void setRetencion(Integer retencion) {
	this.retencion = retencion;
}

public double getTcea() {
	return tcea;
}

public void setTcea(double tcea) {
	this.tcea = tcea;
}

public double getValorNominal() {
	return valorNominal;
}

public void setValorNominal(double valorNominal) {
	this.valorNominal = valorNominal;
}

}

