package peliculas_g47.codigo_g47.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="peliculas")
public class Peliculas implements Serializable{

    @Id
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="pais")
    private String pais;

    @Column(name="an")
    private int an;

    @Column(name="recaudo")
    private int recaudo;

    @Column(name="acciones")
    private String acciones;



    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(int recaudo) {
        this.recaudo = recaudo;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    
    //setters and getters

    
}
