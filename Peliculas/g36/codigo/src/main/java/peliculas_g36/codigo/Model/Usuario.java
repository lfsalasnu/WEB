package peliculas_g36.codigo.Model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

    @Id
    @Column(name="usuario")
    private String usuario;
    
    @Column(name="cont")
    private String cont;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
