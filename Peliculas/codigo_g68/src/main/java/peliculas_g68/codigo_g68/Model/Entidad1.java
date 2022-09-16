package peliculas_g68.codigo_g68.Model;

import javax.persistence.*;

@Entity
@Table(name = "peliculas")
public class Entidad1 {

    @Id
    @Column(name="idpeliculas")
    private int idpeliculas;
    
    @Column(name="Nombre")
    private String Nombre;

    @Column(name = "Pais")
    private String pais;

    @Column(name = "Recaudo")
    private String recaudo;

    @Column(name = "Acciones")
    private String acciones;

    @Column(name = "An")
    private String an;

    public void setIdpeliculas(int idpeliculas) {
        this.idpeliculas = idpeliculas;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRecaudo(String recaudo) {
        this.recaudo = recaudo;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public int getIdpeliculas() {
        return idpeliculas;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getRecaudo() {
        return recaudo;
    }

    public String getAcciones() {
        return acciones;
    }

    public String getAn() {
        return an;
    }

    
    
}
