package pe.edu.upc.galaxy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "valores")
public class Valor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_valor")
    @Size(max = 50)
    private String nombreValor;

    @Column(name = "nombre_emisor")
    @Size(max = 50)
    private String nombreEmisor;

    @NotBlank
    @Column(nullable = false, name = "fecha_emision")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaEmision;

    @NotBlank
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaVencimiento;

    @Column(nullable = false)
    private double cantidad;

    @Size(max = 50)
    @Column(nullable = false)
    private String status;

    @Size(max = 200)
    @Column(nullable = false)
    private String descripcion;

    @NotNull
    @Column(nullable = false, name = "tipo_moneda")
    private Boolean tipoMoneda;

    @Size(max = 50)
    @Column(nullable = false)
    private String direccion;
    
    @OneToMany(mappedBy = "valor", fetch = FetchType.LAZY)
	private List<Cartera> carteras;
    

    public Valor(String nombreValor, String nombreEmisor, Calendar fechaEmision, Calendar fechaVencimiento, double cantidad,
                 String status, String descripcion, Boolean tipoMoneda, String direccion) {
        this.nombreValor = nombreValor;
        this.nombreEmisor = nombreEmisor;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.status = status;
        this.descripcion = descripcion;
        this.tipoMoneda = tipoMoneda;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public Valor setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombreValor() {
        return nombreValor;
    }

    public Valor setNombreValor(String nombreValor) {
        this.nombreValor = nombreValor;
        return this;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public Valor setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
        return this;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public Valor setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
        return this;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Valor setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        return this;
    }

    public double getCantidad() {
        return cantidad;
    }

    public Valor setCantidad(double cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Valor setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Valor setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Boolean getTipoMoneda() {
        return tipoMoneda;
    }

    public Valor setTipoMoneda(Boolean tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Valor setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
}









