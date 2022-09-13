package grupo47.codigo.Entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Entidad1 implements Serializable{
    
    @Id
    private int id;

    @Column(name="nombre")
    private String nombre;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String string) {
        this.nombre = string;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
