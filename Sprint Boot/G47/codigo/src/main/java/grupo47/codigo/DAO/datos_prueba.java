package grupo47.codigo.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabla1")
public class datos_prueba implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public static Long Id;

    public static Long getid(){
        return Id;
    }
}
