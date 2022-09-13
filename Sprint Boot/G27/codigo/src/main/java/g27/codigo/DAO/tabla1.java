package g27.codigo.DAO;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tabla1")
public class tabla1 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    public Long id;

    @Column(name="Nombre", nullable = false,length = 50,unique = false)
    public String nombre;

    @Column(name="Apellidos")
    public String apellidos;

    public Long getId(){
        return id;
    }

    public tabla1(Long id,String apellidos,String nombre) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.id=id;
    }

    public static void main(String[] args) {
        var yo= new tabla1((long) 1,"Salas","Luis");
        
        var emf=Persistence.createEntityManagerFactory("tabla1");
        var em=emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(yo);
            em.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
