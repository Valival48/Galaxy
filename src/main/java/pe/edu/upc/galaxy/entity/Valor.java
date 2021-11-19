package pe.edu.upc.galaxy.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;

import java.util.Date;


@Entity
@Table(name = "valores")
public class Valor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CValor")
    private Integer id;

    @Column(name = "nombre_emisor")
    @Size(max = 50)
    private String nombreEmisor;

    @Column(name = "tipo_valor")
    private String tipo;
    
    @Column(name = "MGarantia",nullable = true)
	private double garantia;
    
    @Column(nullable = false, name = "fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;

    
    @Column(name = "fecha_vencimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;

    @Column(name="importe",nullable = false)
    private double importe;

    @Size(max = 50)
    @Column( name = "status",  nullable = false)
    private String status;

    @Nullable
    @Size(max = 200)
    @Column(name="descripcion",nullable = true)
    private String descripcion;


    @Column(name="retencion")
    private Integer retencion;
    
    @Size(max = 50)
    @Column(name="direccion",nullable = true)
    private String direccion;  
    
	@Column(name = "DDia" , nullable =true)
	private Integer dia;
   
	@Column(name = "Tipo_calendario", nullable =true)
	private String calendario;
	
	@Column(name = "Cargo" , nullable =true)
	private double cargo;

	@Column(name = "DDescuento" , nullable =true)
	@Temporal(TemporalType.DATE)
	private Date fechaDescuento;

	@Column(name = "Tipo_Cambio",nullable =true)
	private String tipoCambio;

	@Column(name = "valor_nominal" , nullable =true)
	private double valorNominal;
    
    @ManyToOne
	@JoinColumn(name = "CTipoMoneda", nullable = false)
	private TipoMoneda tipoMoneda; 
    
    @ManyToOne
	@JoinColumn(name = "CCliente", nullable = false)
	private Cliente cliente;
    
    @ManyToOne
	@JoinColumn(name = "CTasa", nullable = true)
	private Tasa tasa;
    
	public Valor() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombreEmisor() {
		return nombreEmisor;
	}

	public void setNombreEmisor(String nombreEmisor) {
		this.nombreEmisor = nombreEmisor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoMoneda getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(TipoMoneda tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getGarantia() {
		return garantia;
	}

	public void setGarantia(double garantia) {
		this.garantia = garantia;
	}

	public Integer getRetencion() {
		return retencion;
	}

	public void setRetencion(Integer retencion) {
		this.retencion = retencion;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	 

  
}









