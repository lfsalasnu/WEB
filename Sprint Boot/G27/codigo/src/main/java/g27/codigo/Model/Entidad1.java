package g27.codigo.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="datos1")
public class Entidad1 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = true,unique = true)
    private int id;

    @Column(name="nombre",length = 40)
    private String nombre;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
