package peliculas_g27.codigo.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable{
    
    @Id
    @Column(name="id")
    private String id;

    @Column(name="cont")
    private String cont;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}
