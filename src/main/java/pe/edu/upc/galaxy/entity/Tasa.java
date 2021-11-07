package pe.edu.upc.galaxy.entity;

	import java.util.List;

import javax.persistence.*;


	@Entity
	@Table(name = "tasas")
	@Inheritance(strategy = InheritanceType.JOINED)
	public class Tasa {

	    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private int periodo;

	    @Column(nullable = false, name = "perido_capitalizacion")
	    private int peridoCapitalizacion;

	    @Column(name = "tipo_taza")
	    private boolean tipoTaza;

	    @Column(name = "porcentaje_taza")
	    private float porcentajeTaza;
	    
	    @OneToMany(mappedBy = "tasa", fetch = FetchType.LAZY)
		private List<Cartera> carteras;

	    public Tasa() {}

	    public Tasa(int periodo, int peridoCapitalizacion, boolean tipoTaza, float porcentajeTaza) {
	        this.periodo = periodo;
	        this.peridoCapitalizacion = peridoCapitalizacion;
	        this.tipoTaza = tipoTaza;
	        this.porcentajeTaza = porcentajeTaza;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(int id) {
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

	    public boolean isTipoTaza() {
	        return tipoTaza;
	    }

	    public void setTipoTaza(boolean tipoTaza) {
	        this.tipoTaza = tipoTaza;
	    }

	    public float getPorcentajeTaza() {
	        return porcentajeTaza;
	    }

	    public void setPorcentajeTaza(float porcentajeTaza) {
	        this.porcentajeTaza = porcentajeTaza;
	    }
	}

