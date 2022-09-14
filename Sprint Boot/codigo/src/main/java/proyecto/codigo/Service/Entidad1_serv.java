package proyecto.codigo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.codigo.Entidades.Entidad1;
import proyecto.codigo.Repositories.Entidad1_repo;

@Service
public class Entidad1_serv {
    
    @Autowired
    public Entidad1_repo ent;

    public void guardar(Entidad1 ent1){
        ent.save(ent1);
    }

}
