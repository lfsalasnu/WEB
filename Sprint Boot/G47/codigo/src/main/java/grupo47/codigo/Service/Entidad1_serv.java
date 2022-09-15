package grupo47.codigo.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo47.codigo.Entidades.Entidad1;
import grupo47.codigo.Repositories.Entidad1_repo;

@Service
@Transactional
public class Entidad1_serv {
    @Autowired
    private Entidad1_repo rp;

    public void guardar(Entidad1 ent){
        rp.save(ent);
    }
}
