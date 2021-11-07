package pe.edu.upc.galaxy.entity;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name= "clientes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="NCliente", length =50,  nullable=false)
    private String name;

    @Column(name="TCorreo", length =50,  nullable=false)
    private String email;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Cartera> carteras;

    public Cliente() {}

    public Cliente(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
