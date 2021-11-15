package pe.edu.upc.galaxy.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="TipoMoneda")
public class TipoMoneda {
	@Id 
	@Column(name = "CTipoMoneda", length = 4, nullable = false)
	private Integer CTipoMoneda;
	
	@Column(name = "NTipoMoneda", length = 20)
	private String NTipoMoneda;
	
	@OneToMany(mappedBy = "tipoMoneda", fetch = FetchType.LAZY)
	private List<Valor> valores;

	public TipoMoneda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoMoneda(Integer cTipoMoneda, String nTipoMoneda, List<Valor> valores) {
		super();
		CTipoMoneda = cTipoMoneda;
		NTipoMoneda = nTipoMoneda;
		this.valores = valores;
	}

	public Integer getCTipoMoneda() {
		return CTipoMoneda;
	}

	public void setCTipoMoneda(Integer cTipoMoneda) {
		CTipoMoneda = cTipoMoneda;
	}

	public String getNTipoMoneda() {
		return NTipoMoneda;
	}

	public void setNTipoMoneda(String nTipoMoneda) {
		NTipoMoneda = nTipoMoneda;
	}

	public List<Valor> getValores() {
		return valores;
	}

	public void setValores(List<Valor> valores) {
		this.valores = valores;
	}	
	
}
