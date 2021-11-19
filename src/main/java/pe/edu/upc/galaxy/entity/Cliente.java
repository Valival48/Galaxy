package pe.edu.upc.galaxy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name= "clientes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CCliente")
    private Integer id;
    
    @Column(name="NCliente", length =50,  nullable=false)
    private String name;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Valor> valores;

    public Cliente() {
    	super();
		valores = new ArrayList<Valor>();
    }


    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


	public List<Valor> getValores() {
		return valores;
	}


	public void setValores(List<Valor> valores) {
		this.valores = valores;
	}


	public void setId(Integer id) {
		this.id = id;
	}




  
}
