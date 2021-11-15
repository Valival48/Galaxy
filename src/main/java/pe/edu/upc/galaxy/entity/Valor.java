package pe.edu.upc.galaxy.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.springframework.lang.Nullable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "valores")
public class Valor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_cliente")
    @Size(max = 50)
    private String nombreCliente;

    @Column(name = "nombre_emisor")
    @Size(max = 50)
    private String nombreEmisor;

    @Column(name = "tipo_valor")
    private String tipo;
    
    
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

   
    @ManyToOne
	@JoinColumn(name = "CTipoMoneda", nullable = false)
	private TipoMoneda tipoMoneda; 

    @Size(max = 50)
    @Column(name="direccion",nullable = true)
    private String direccion;
    
    @OneToMany(mappedBy = "valor", fetch = FetchType.LAZY)
	private List<Cartera> carteras;
    
        
	public Valor() {
		super();
		carteras = new ArrayList<Cartera>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
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

	public List<Cartera> getCarteras() {
		return carteras;
	}

	public void setCarteras(List<Cartera> carteras) {
		this.carteras = carteras;
	}
    
   

  
}









